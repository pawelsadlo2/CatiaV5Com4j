package com4jExtensions.implicitExtensions

import CatiaV5TypeLibs.InfTypeLib.{SelectedElement, Selection}
import com4j.Com4jObject

import scala.collection.convert.ImplicitConversionsToScala._
import scala.reflect.ClassTag

object iterableExtensions {

  trait generalIterable[T <: Com4jObject] extends Iterable[T] {

    def iterator: Iterator[T]

  }

  implicit class iterableIterable[U <: java.lang.Iterable[Com4jObject]](obj: U) extends generalIterable[Com4jObject] {
    def iterator: Iterator[Com4jObject] = obj.iterator()
  }

  implicit class selectionIterable(obj: Selection) extends generalIterable[SelectedElement] {

    def iterator = new customIterator

    class customIterator extends Iterator[SelectedElement] {
      var current = 0
      val count: Int = obj.count()

      def hasNext: Boolean = current < count

      def next: SelectedElement =
        if (hasNext) {
          current += 1
          obj.item(current)
        } else throw new IndexOutOfBoundsException
    }

  }

}
