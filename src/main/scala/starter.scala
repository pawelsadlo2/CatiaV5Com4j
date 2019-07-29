
import com4jExtensions.toScalaConverters
import CatiaV5TypeLibs.InfTypeLib._
import com4j._

import scala.util.{Failure, Success, Try}
import java.lang.reflect.Method

import CatiaV5TypeLibs.HybridShapeTypeLib._

import com4jExtensions.IIDsFileUpdate.{getIIdsList, typeLibsFolder}
import com4jExtensions.helpers._
import org.reflections.Reflections

object starter {


  def main(args: Array[String]): Unit = {



    // .filter(_.)


    //val reflections = new Reflections("CatiaV5TypeLibs.HybridShapeTypeLib.*")
    //val subtypes = reflections.
    //val iidsList = getIIdsList(typeLibsFolder)
    //    val path1 = "C:\\Users\\pawel\\Desktop\\CatiaV5Com4j\\utils\\CATIA\\1"
    //    val path2 = "C:\\Users\\pawel\\Desktop\\CatiaV5Com4j\\utils\\CATIA\\2"
    //    val intersect = filesIntersection(path1, path2)
    val activeDoc = catiaApp.activeDocument()
    val selection = activeDoc.selection()
    val converter = new toScalaConverters(selection)

    val list = converter.toList()
    val types = list.map(x => getType(x.asInstanceOf[Com4jObject].queryInterface(classOf[AnyObject])))


    //val instance = list.head.asInstanceOf[Com4jObject].queryInterface(classOf[AnyObject])
    val instanceMethods = getReferenceComMethods(list.head)
    //val subtypes = reflections.getAllTypes
    //val instanceQuery = instance.queryInterface[classOf[instanceType]]

    //val referenceMethods = methods.toList.filter(_.getReturnType.getTypeName.contains("Reference"))


    //val x= new java.lang.Class()
    //x.forname
    //COM4J.getIID()
    // val insClass = instance.getClass


    //val z = instance.getPointer

    val t = 1



    //    val name = instance.queryInterface(classOf[AnyObject]).name
    //    val instance2 = instance.queryInterface(classOf[ShapeInstance])
    //    val inputsCount = instance2.inputsCount()
    //    val outputs = instance2.outputsCount()
    //    val x = 1
    //val listString = list.toString()

    //
    //    val ROT = new toScalaConverters(catiaApp.documents())
    //    val RotList = ROT.toList()
    //    val rotString = RotList.toString()

    //    val ROT = new toScalaConverters(COM4J.getROT)
    //    val RotList = ROT.toList()
    //    val rotString = RotList.toString()
  }

  def methods(inObj: Com4jObject): List[Method] = inObj.getClass.getDeclaredMethods.toList


}
