import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._

import scala.util.{Failure, Success, Try}

object starter {
  def main(args: Array[String]) = {


    val catiaApp = getCatiaApp
    val documents = catiaApp.windows()

    documents.iterator().next().queryInterface(classOf[Window]).caption()


  }

  def getCatiaApp(): Application = {

    val excelAppTry = Try(COM4J.getActiveObject(
      classOf[Application],
      "{87fd6f40-e252-11d5-8040-0010b5fa1031}"))

    excelAppTry match {
      case Success(value) => value
      case Failure(_) => ClassFactory.createApplication()

    }
  }
}
