package com4jExtensions

import java.lang.reflect.Method

import CatiaV5TypeLibs.InfTypeLib.{Collection, SelectedElement}
import com4j._

import scala.collection.JavaConverters


class toScalaConverters(inObj: Any) {

  @throws[NoSuchElementException]("")
  def toList(): List[Any] = {
    inObj match {
      case iterable: java.lang.Iterable[Any] => iterableToList(iterable)
      case itemable => itemableValuesToListTry(itemableToList(itemable))
    }

  }

  def itemableToList[T](itemable: T): List[Any] = {
    def itemableToListIter[T](iter: Int, listIter: List[Any], itemable: T): List[Any] = {
      val methods = itemable.getClass.getDeclaredMethods.toList
      val countMethod: Method = methods.lift(methods.indexWhere(_.getName == "count"))
        .getOrElse(throw new NoSuchElementException("Object doesnt implement count method"))
      val itemMethod: Method = methods.lift(methods.indexWhere(m => m.getName == "item" && m.getParameterCount == 1))
        .getOrElse(throw new NoSuchElementException("Object doesnt implement item(i) method"))
      val count: Int = countMethod.invoke(itemable).toString.toInt

      if (iter > count) listIter
      else {
        val javaIter = iter.asInstanceOf[AnyRef]
        val item: Any = itemMethod.invoke(itemable, javaIter)


        itemableToListIter(iter + 1, listIter ++ List(item), itemable)
      }
    }
    itemableToListIter(1, List(), itemable)
  }

  def itemableValuesToListTry(itemableList: List[Any]): List[Any] = itemableList.map(item => {
    if (item.asInstanceOf[Com4jObject].is(classOf[SelectedElement])) item.asInstanceOf[Com4jObject].queryInterface(classOf[SelectedElement]).value()
    else item
  })

  def iterableToList(obj: java.lang.Iterable[Any]): List[Any] = {
    val inObjIterable: java.util.Iterator[Any] = obj.iterator
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
