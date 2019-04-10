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

/**
  * `System.getProperty("os.arch")`
  * It'll tell us on which platform Java Program is executing. Based on that we'll load respective DLL file.
  * Placed under same folder of program file(.java/.class).
  */

//val libFile = {
//  val isSystemx64=System.getProperty("os.arch") == "amd64"
//  if (isSystemx64) "com4j-amd64.dll"
//  else "com4j-x86.dll"
//}
//
//val patch =
import java.io.InputStream

//val inputStream = classOf[Nothing].getResourceAsStream(libFile)


val catiaApp = getCatiaApp
/*val documents = catiaApp.documents()
val documentsList: List[Document] =
  JavaConverters.asScalaIterator(documents.iterator)
    .toList.map(_.queryInterface(classOf[Document]))*/
//java.util.ResourceBundle.clearCache()
//catiaApp.activeDocument().selection().parent()

//documents.add(new Holder("Product"))