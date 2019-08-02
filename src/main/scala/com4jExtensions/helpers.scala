package com4jExtensions

import CatiaV5TypeLibs.InfTypeLib.{Application, ClassFactory}
import com4j.COM4J
import com4jExtensions.implicitExtensions.iterableExtensions._

import scala.util.{Failure, Success, Try}
import scala.language.implicitConversions

object helpers {

  def getOrCreateCatia: Application = {

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

  def catiaApps = COM4J.getROT.filter(_.is(classOf[Application])).toList

}

//  class conversionHelper[T <: Com4jObject](x: T) {
//    def I: T = x.queryInterface(classOf[T])
//  }
//  implicit def n[T<:Com4jObject,U](x:T): U = x.queryInterface(classOf[U])

//implicit def toConversionHelper[U <: Com4jObject](x: U) = new conversionHelper[U](x)


/*    class conversionHelper[T <: Com4jObject](x: T) {
      def toList[T <: Com4jObject]: List[T] = new toScalaConverters(x).toList()
    }*/

//  implicit def toConversionHelper[U <: Com4jObject](x: U) = new conversionHelper[U](x)


// implicit def toDocument(x: Com4jObject) = x.queryInterface(classOf[Document])


/*  def getType(obj: Any): String = {
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
  }*/

/*  @throws[NoSuchElementException]("Type doesn't figure in library")
  def getComMethods(obj: Any): Set[Method] = {

    val objType: String = getType(obj)
    val reflections = new Reflections("CatiaV5TypeLibs")
    val scanner = reflections.getStore.get("SubTypesScanner")
    val values: List[String] = scanner.values().toArray(Array.empty[String]).toList
    val objFullType = values.filter(_.endsWith(objType)).headOption.getOrElse(throw new NoSuchElementException("Type doesn't figure in library"))

    val instanceClass = forName(objFullType)
    getMethods(instanceClass).toArray(Array.empty: Array[Method]).toSet
  }*/

/*  def getReferenceComMethods(obj: Any): Set[Method] = {
    val methods = getComMethods(obj)
    val referencesHoldersMethods = methods.filter(_.getParameterTypes.contains(classOf[Holder[Reference]]))
    val referencesHoldersMethodsWithoutAnyObject = referencesHoldersMethods.filterNot(_.getDeclaringClass.getName.endsWith("AnyObject"))
    val referencesMethods = methods.filter(_.getReturnType == classOf[Reference])
    val z = referencesMethods.head.invoke(obj.asInstanceOf[Com4jObject].queryInterface(referencesMethods.head.getDeclaringClass))
    referencesHoldersMethodsWithoutAnyObject ++ referencesMethods

  }*/


//val ROT: ROT = COM4J.getROT
//    val ROTList = ROT.toList
//    val filtered = ROTList.map(_.asInstanceOf[Com4jObject]).filter(_.is(classOf[Application]))
//    val headThread = filtered.head.getComThread
//
//    //headThread.kill()
//    val rot2 = COM4J.getROT.toList.map(_.asInstanceOf[Com4jObject]).filter(_.is(classOf[Application]))
//    //headThread.run()
//    //    filtered.he
//    //    val c1 =ca
//    val dount = catiaApp.documents.toList
//    val c2 = catiaApp


//filtered.head.dispose()
//val app = filtered.head.queryInterface(classOf[Application])


//val threadNames = filtered.map(_.getComThread.getName)
//val tasks = ROTList.map(x=>COM4J.getObject())
//    val catias = ROTList.map(_.asInstanceOf[Com4jObject]).filter(_.is(classOf[Application])).map(_.queryInterface(classOf[Application]))
//    val names = catias.map(instance => (instance.documents.toList.map(_.asInstanceOf[Com4jObject].queryInterface(classOf[Document]).fullName()), instance))
//    val test = names.head == names(1)
//    //val catiaApps = ROTList.map(_.asInstanceOf[Application]).lift
//    ROTList
//val x = 1

//}


