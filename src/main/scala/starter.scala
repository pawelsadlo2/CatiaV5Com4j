
import CatiaV5TypeLibs.InfTypeLib.{AnyObject, Document}
import CatiaV5TypeLibs.PartTypeLib.{Bodies, Body, Part, PartDocument, ProductDocument}
import com4jExtensions.helpers._

import scala.language.implicitConversions
import com4jExtensions.implicitExtensions.iterableExtensions._
import com4jExtensions.implicitExtensions.generalExtensions._
import com4jExtensions.implicitExtensions.generalExtensions.queryImplicitFunctions._
import com4jExtensions.implicitExtensions.generalExtensions.collectionsImplicitConversions._

import scala.util.{Failure, Try}

object starter {


  def main(args: Array[String]): Unit = {

    val catia = getOrCreateCatia
    val partDocs = catia.documents().map(x => Try(x.identity: PartDocument))
    val productDocs = catia.documents().map(x => Try(x.identity: ProductDocument))
    val partDocsGot = partDocs.filter(_.isSuccess).map(_.get)
    val mappint = partDocsGot.map(_.part().name())
    /*    val dd = docs.map(x => x: PartDocument)
        val fullnames = dd.map(_.fullName())

        val partDocsTest = docs.map(x => (x: PartDocument).part().bodies().map(n => n: Body))
        val flattened = partDocsTest.flatten
        val flatMapped = docs.map(x => (x: PartDocument).part().bodies()).flatMap(x => x.map(x => x))
        val connected = docs.head :: flattened*/
    val x = 1
  }

}
