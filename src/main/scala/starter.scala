import CatiaV5TypeLibs.InfItfTypeLib._
import com4j._
import com4jExtensions.toScalaConverters

import scala.collection.JavaConverters
import scala.util.{Failure, Success, Try}

object starter {
  def main(args: Array[String]): Unit = {
    val Rot = COM4J.getROT
    val x = JavaConverters.asScalaIterator(Rot.iterator()).toList
    val catiaApp = getCatiaApp
    val sel = catiaApp.activeDocument().selection()

    val test = new toScalaConverters(sel).toList()


    val catiaInstances = x.filter(_.is(classOf[Application]))
    //   val
    //z.map(_.)
    val u = 1
    //    val windows = catiaApp.windows().queryInterface(classOf[Windows])
    //    val col: ComObjectCollector = new ComObjectCollector()
    //    COM4J.addListener(col)
    //    val thread = catiaApp.getComThread
    //    val x = new toScalaConverters(catiaApp.activeDocument().selection())
    //    val list = x.selectionToList()
    //
    //
    //    val t=0
    // val z: Unit = list.map(x => x.queryInterface(classOf[AnyObject]).name(new Holder(x.hashCode().toString)))
    /*val documents = catiaApp.documents()
    val documentsList: List[Document] =
      JavaConverters.asScalaIterator(documents.iterator)
        .toList.map(_.queryInterface(classOf[Document]))*/
    //.util.ResourceBundle.clearCache()
    //val selection: Selection = catiaApp.activeDocument().selection().queryInterface(classOf[Selection])
    //val asMap = new asList(selection)
    //val mapped = asMap.convertToList
    //val x =2
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
