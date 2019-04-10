import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._
import com4jExtensions.toScalaConverters
import scala.collection.JavaConverters
import scala.util.{Failure, Success, Try}

object starter {
  def main(args: Array[String]): Unit = {


    val Rot = COM4J.getROT

    val catiaApp = getCatiaApp


    val ROT = JavaConverters.asScalaIterator(COM4J.getROT.iterator()).toList
    val ROT1 = ROT.map(_.queryInterface(classOf[Com4jObject]))
    val catiaInstances = ROT1.map(x => (x, x.is(classOf[Application])))
  }


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
