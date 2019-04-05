import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._

import scala.collection.JavaConverters
import scala.util.{Failure, Success, Try}

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

val catiaApp = getCatiaApp
/*val documents = catiaApp.documents()
val documentsList: List[Document] =
  JavaConverters.asScalaIterator(documents.iterator)
    .toList.map(_.queryInterface(classOf[Document]))*/
java.util.ResourceBundle.clearCache()
catiaApp.activeDocument().selection().parent()

//documents.add(new Holder("Product"))