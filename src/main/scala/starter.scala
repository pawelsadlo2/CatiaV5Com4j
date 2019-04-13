import java.io.File

import CatiaV5TypeLibs.PartItfTypeLib.{HybridShapeInstance, ShapeInstance}

object starter extends comImportHelper {

  import CatiaV5TypeLibs.InfItfTypeLib._
  import com4j._
  import com4jExtensions.toScalaConverters

  import scala.util.{Failure, Success, Try}

  def main(args: Array[String]): Unit = {

    val path1 = "C:\\Users\\pawel\\Desktop\\CatiaV5Com4j\\utils\\CATIA\\1"
    val path2 = "C:\\Users\\pawel\\Desktop\\CatiaV5Com4j\\utils\\CATIA\\2"
    val intersect = filesIntersection(path1, path2)

    val catiaApp = getCatiaApp
    val activeDoc = catiaApp.activeDocument()
    val selection = activeDoc.selection()
    val converter = new toScalaConverters(selection)

    val list = converter.toList()
    val instance = list.head
    val name = instance.queryInterface(classOf[AnyObject]).name
    val instance2 = instance.queryInterface(classOf[ShapeInstance])
    val inputsCount = instance2.inputsCount()
    val outputs = instance2.outputsCount()
    val x = 1
    //val listString = list.toString()

    //
    //    val ROT = new toScalaConverters(catiaApp.documents())
    //    val RotList = ROT.toList()
    //    val rotString = RotList.toString()

    //    val ROT = new toScalaConverters(COM4J.getROT)
    //    val RotList = ROT.toList()
    //    val rotString = RotList.toString()
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
