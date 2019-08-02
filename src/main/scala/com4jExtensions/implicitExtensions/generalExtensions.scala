package com4jExtensions.implicitExtensions

import CatiaV5TypeLibs.InfTypeLib.Document
import CatiaV5TypeLibs.PartTypeLib.{Body, Part, PartDocument, ProductDocument}
import com4j.Com4jObject

import scala.language.implicitConversions
import scala.util.Try

object generalExtensions {

  implicit class general[T <: Com4jObject](obj: T) {

    def I[B <: Com4jObject](comInterface: Class[B]): B = obj.queryInterface(comInterface): B

    def identity: T = obj
  }

  object queryImplicitFunctions {

    private def queryMatching[U <: Com4jObject, V <: Com4jObject](cls: Class[V])(implicit el: U): V = el match {
      case ok if ok.is(cls) => ok.queryInterface(cls)
      case _ => throw new ClassCastException("another data type is being casted to " + cls.getSimpleName + " try filtering parent collection first")
    }

    implicit def queryBody[T <: Com4jObject](x: T): Body = queryMatching(classOf[Body])(x)

    implicit def queryPart[T <: Com4jObject](x: T): Part = queryMatching(classOf[Part])(x)

    implicit def queryPartDocument[T <: Com4jObject](x: T): PartDocument = queryMatching(classOf[PartDocument])(x)

    implicit def queryProductDocument[T <: Com4jObject](x: T): ProductDocument = queryMatching(classOf[ProductDocument])(x)
  }

  object collectionsImplicitConversions {

    implicit def iterableToList[T <: Com4jObject](x: Iterable[T]): List[T] = x.toList

  }

}