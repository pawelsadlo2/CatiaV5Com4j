package com4jExtensions.implicitExtensions

import CatiaV5TypeLibs.InfTypeLib.{Application, Document}
import CatiaV5TypeLibs.PartTypeLib.{Body, Part, PartDocument, ProductDocument}
import com4j.{Com4jObject, Holder}

import scala.language.implicitConversions
import scala.reflect.ClassTag


object generalExtensions {

  implicit class General[T <: Com4jObject](obj: T) {

    def I[B <: Com4jObject](comInterface: Class[B]): B = obj.queryInterface(comInterface): B

    def identity: T = obj
  }

  object argumentsImplicits {
    implicit def elemToHolder[T](elem: T): Holder[T] = new Holder(elem)
  }

  object queryImplicitFunctions {

    private def queryMatching[IN <: Com4jObject, OUT <: Com4jObject](cls: Class[OUT])(implicit el: IN): OUT = el match {
      case ok if ok.is(cls) => ok.queryInterface(cls)
      case _ => throw new ClassCastException("another data type is being casted to " + cls.getSimpleName + " try filtering parent collection first")
    }


    implicit def queryBody[T <: Com4jObject](x: T): Body = queryMatching(classOf[Body])(x)

    implicit def queryPart[T <: Com4jObject](x: T): Part = queryMatching(classOf[Part])(x)

    implicit def queryPartDocument[T <: Com4jObject](x: T): PartDocument = queryMatching(classOf[PartDocument])(x)

    //implicit def queryDocument[T <: Com4jObject](x: T): Document = queryMatching(classOf[Document])(x)

    implicit def queryProductDocument[T <: Com4jObject](x: T): ProductDocument = queryMatching(classOf[ProductDocument])(x)

    implicit def queryApplication[T <: Com4jObject](x: T): Application = queryMatching(classOf[Application])(x)

  }

  object collectionsImplicitConversions {

    implicit def iterableToList[T <: Com4jObject](x: Iterable[T]): List[T] = x.toList

  }

}