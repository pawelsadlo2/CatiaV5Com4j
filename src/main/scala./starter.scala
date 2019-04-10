import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._
import com4jExtensions.toScalaConverters

import scala.collection.JavaConverters


import scala.util.{Failure, Success, Try}

object starter {

  def main(args: Array[String]): Unit = {

    // val libFile:String = System.getProperty("os.arch")//.equals("amd64")// ? "jacob-1.17-x64.dll" : "jacob-1.17-x86.dll"

    val catiaApp = getCatiaApp
    val ROT = JavaConverters.asScalaIterator(COM4J.getROT.iterator()).toList
    val ROT1 = ROT.map(_.queryInterface(classOf[Com4jObject]))
    val ROT2 = ROT1.map(x => (x, x.is(classOf[Application])))

    val documents1 = catiaApp.documents()
    //    val documents = new asList(documents1).convertToList
    //    documents.map(doc => println(doc.queryInterface(classOf[Document]).name()))

    //.util.ResourceBundle.clearCache()
    //  val selection: Selection = catiaApp.activeDocument().selection().queryInterface(classOf[Selection])
    // val asMap = new asList(selection)
    // val mapped = asMap.convertToList
    // val x =2

  }

  def getCatiaApp(): Application = {

    val excelAppTry = Try(COM4J.getActiveObject(
      classOf[Application],
      "{87fd6f40-e252-11d5-8040-0010b5fa1031}"))

    excelAppTry match {
      case Success(value) => value
      case Failure(_) => {
        val catia = ClassFactory.createApplication()
        catia.visible(true)
        catia
      }

    }
  }
}
