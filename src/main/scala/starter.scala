import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._
import com4jExtensions._

import scala.util.{Failure, Success, Try}

object starter {
  def main(args: Array[String]): Unit = {


    val catiaApp = getCatiaApp
    /*val documents = catiaApp.documents()
    val documentsList: List[Document] =
      JavaConverters.asScalaIterator(documents.iterator)
        .toList.map(_.queryInterface(classOf[Document]))*/
    //.util.ResourceBundle.clearCache()
    val selection: Selection = catiaApp.activeDocument().selection().queryInterface(classOf[Selection])
    val asMap = new asMap(selection)
    val mapped = asMap.toMap()
    val x =2
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
