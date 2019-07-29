package com4jExtensions

import java.lang.reflect.Method
import java.util.NoSuchElementException

import CatiaV5TypeLibs.InfTypeLib.{AnyObject, Application, ClassFactory, Reference}
import com4j.{COM4J, Com4jObject, Holder}

import scala.util.{Failure, Success, Try}
import com4jExtensions._
import org.reflections.Reflections

import scala.reflect.runtime.universe._
import org.reflections.ReflectionUtils._

object helpers {

  def getType(obj: Any): String = {
    val objConverted = obj.asInstanceOf[Com4jObject].queryInterface(classOf[AnyObject])
    val selection = catiaApp.activeDocument().selection()
    val backupSelectionPre = new toScalaConverters(selection).itemableToList(selection)
    val backupSelection = new toScalaConverters(backupSelectionPre).itemableValuesToListTry(backupSelectionPre)
    selection.clear()
    selection.add(objConverted)
    val objType: String = selection.item(1).`type`()
    selection.clear()
    backupSelection.foreach(x =>
      selection.add(x.asInstanceOf[Com4jObject].queryInterface(classOf[AnyObject])))
    objType
  }

  @throws[NoSuchElementException]("Type doesn't figure in library")
  def getComMethods(obj: Any): Set[Method] = {

    val objType: String = getType(obj)
    val reflections = new Reflections("CatiaV5TypeLibs")
    val scanner = reflections.getStore.get("SubTypesScanner")
    val values: List[String] = scanner.values().toArray(Array.empty[String]).toList
    val objFullType = values.filter(_.endsWith(objType)).headOption.getOrElse(throw new NoSuchElementException("Type doesn't figure in library"))

    val instanceClass = forName(objFullType)
    getMethods(instanceClass).toArray(Array.empty: Array[Method]).toSet
  }

  def getReferenceComMethods(obj: Any): Set[Method] = {
    val methods = getComMethods(obj)
    val referencesHoldersMethods = methods.filter(_.getParameterTypes.contains(classOf[Holder[Reference]]))
    val referencesHoldersMethodsWithoutAnyObject = referencesHoldersMethods.filterNot(_.getDeclaringClass.getName.endsWith("AnyObject"))
    val referencesMethods = methods.filter(_.getReturnType == classOf[Reference])
    val z = referencesMethods.head.invoke(obj.asInstanceOf[Com4jObject].queryInterface(referencesMethods.head.getDeclaringClass))
    referencesHoldersMethodsWithoutAnyObject ++ referencesMethods

  }


  val catiaApp: Application = {

    val catiaAppTry = Try(COM4J.getActiveObject(
      classOf[Application],
      "{87fd6f40-e252-11d5-8040-0010b5fa1031}"))

    catiaAppTry match {
      case Success(value) => value
      case Failure(_) => {
        val catia = ClassFactory.createApplication()
        catia.visible(true)
        catia
      }
    }
  }


}
