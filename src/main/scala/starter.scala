
import CatiaV5TypeLibs.InfTypeLib.{AnyObject, Document}
import CatiaV5TypeLibs.PartTypeLib.{Bodies, Body, Part, PartDocument, ProductDocument}
import com4j.{COM4J, Holder}
import com4jExtensions.helpers._

import scala.language.implicitConversions
import com4jExtensions.implicitExtensions.iterableExtensions._
import com4jExtensions.implicitExtensions.generalExtensions._
import com4jExtensions.implicitExtensions.generalExtensions.queryImplicitFunctions._
import com4jExtensions.implicitExtensions.generalExtensions.collectionsImplicitConversions._

import scala.util.{Failure, Random, Try}

object starter {


  def main(args: Array[String]): Unit = {

    val catia = getOrCreateCatia
    catia.documents().add(new Holder("Part"))
    val partDocs = catia.documents().map(x => Try(x.identity: PartDocument))
    val productDocs = catia.documents().map(x => Try(x.identity: ProductDocument))
    val partDocsGot = partDocs.filter(_.isSuccess).map(_.get)
    val ProductsDocsGot = productDocs.filter(_.isSuccess).map(_.get)
    //ProductsDocsGot.foreach(x=>println(x.product.name))
    ProductsDocsGot.foreach(
      _.product().partNumber(
        new Holder(Random.alphanumeric.take(5).toList.mkString)))
val x=1
    /*    val dd = docs.map(x => x: PartDocument)
        val fullnames = dd.map(_.fullName())

        val partDocsTest = docs.map(x => (x: PartDocument).part().bodies().map(n => n: Body))
        val flattened = partDocsTest.flatten
        val flatMapped = docs.map(x => (x: PartDocument).part().bodies()).flatMap(x => x.map(x => x))
        val connected = docs.head :: flattened*/

  }

}
