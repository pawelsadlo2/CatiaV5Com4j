import CatiaV5TypeLibs.InfTypeLib._
import CatiaV5TypeLibs.MecModTypeLib._
import CatiaV5TypeLibs.KnowledgewareTypeLib._

import starter.getCatiaApp
import com4j._
import com4jExtensions.toScalaConverters

import scala.util.{Failure, Success, Try}

//def getCatiaApp(): Application = {
//
//  val excelAppTry = Try(COM4J.getActiveObject(
//    classOf[Application],
//    "{87fd6f40-e252-11d5-8040-0010b5fa1031}"))
//
//  excelAppTry match {
//    case Success(value) => value
//    case Failure(_) => {
//      val catia = ClassFactory.createApplication()
//      catia.visible(true)
//      catia
//    }
//  }
//}
val x =1
//val catiaApp:Application = getCatiaApp
//val activeDoc = catiaApp.activeDocument()
//val selection = new toScalaConverters(activeDoc.selection()).toList()