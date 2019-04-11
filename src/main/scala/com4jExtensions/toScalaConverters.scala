package com4jExtensions

import java.lang.reflect.Method

import CatiaV5TypeLibs.InfItfTypeLib.{Collection, SelectedElement}
import com4j._

import scala.collection.JavaConverters


trait itemable {

  def count

  def item(i: Int): SelectedElement

}


class toScalaConverters[T /*<: Com4jObject*/ ](inObj: T) {

  @throws[NoSuchElementException]("")
  def toList(): List[Com4jObject] = {
    inObj match {
      case iterable: Collection => iterableToList(iterable)
      case itemable => {
        val methods = itemable.getClass.getDeclaredMethods.toList
        val countMethod: Method = methods.lift(methods.indexWhere(_.getName == "count"))
          .getOrElse(throw new NoSuchElementException("Object doesnt implement count method"))

        val itemMethod: Method = methods.lift(methods.indexWhere(m => m.getName == "item" && m.getParameterCount == 1))
          .getOrElse(throw new NoSuchElementException("Object doesnt implement item(i) method"))

        val count: Int = countMethod.invoke(itemable).toString.toInt

        def itemableToList(iter: Int, listIter: List[Com4jObject]): List[Com4jObject] = {
          if (iter > count) listIter
          else {
            //iter.getClass

            val item: SelectedElement = itemMethod.invoke(itemable, scala.Array(iter)).asInstanceOf[SelectedElement]
            itemableToList(iter + 1, listIter ++ List(item.value))
          }
        }

        itemableToList(1, List())
      }
    }


  }



  def iterableToList(obj: Collection): List[Com4jObject] = {
    val inObjIterable = obj.queryInterface(classOf[Collection]).iterator()
    JavaConverters.asScalaIterator(inObjIterable).toList
  }

}


/*
class asList[T <: Com4jObject](val inObj: T) {

  def convertToList: CatiaV5TypeLibs.PartItfTypeLib.List[Com4jObject] = {
    inObj match {
      case sel: Selection => {
        val count = sel.count()
        toListOneByOne(sel, 1, count)
      }
      case iterable: Collection => JavaConverters.asScalaIterator(iterable.iterator).toList
    }

    def toListOneByOne[T <: Selection](inObj: T, iter: Int, count: Int): CatiaV5TypeLibs.PartItfTypeLib.List[Com4jObject] = {
      if (iter > count) CatiaV5TypeLibs.PartItfTypeLib.List()
      else CatiaV5TypeLibs.PartItfTypeLib.List(inObj.item(iter)) ++ toListOneByOne(inObj, iter + 1, count)
    }

  }

}*/
