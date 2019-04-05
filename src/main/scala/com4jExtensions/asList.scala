package com4jExtensions

import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._

class asMap(val inSel: Selection) {

  def toMap(): List[Com4jObject] = {
    val count:Int = inSel.count2()

    def toMapIter(iter: Int): List[Com4jObject] = {
      if (iter > count) Nil
      else List(inSel.item(iter)) ++ toMapIter(iter + 1)
    }

    toMapIter(1)
  }

}


