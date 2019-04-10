package com4jExtensions

import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._

import scala.collection.JavaConverters

class asList[T <: Com4jObject](inObj: T) {

  def convertToList: List[Com4jObject] = {

    def toListOneByOne[T <: Selection](inObj: T, iter: Int, count: Int): List[Com4jObject] = {
      if (iter > count) List()
      else List(inObj.item(iter)) ++ toListOneByOne(inObj, iter + 1, count)
    }

    inObj match {
      case sel: Selection => {
        val count = sel.count()
        toListOneByOne(sel, 1, count)
      }
      case iterable: Collection => JavaConverters.asScalaIterator(iterable.iterator).toList
    }

  }
}