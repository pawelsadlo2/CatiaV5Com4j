import java.io.File

import CatiaV5TypeLibs.InfTypeLib.Files

import java.io.{File, FileWriter, PrintWriter}

import scala.collection.immutable.Map.Map1
import scala.io.Source


//val writer = new FileWriter(file)
//writer.write("import CatiaV5TypeLibs.InfItfTypeLib.*;\n")
//writer.write("xx")
//writer.close


//line.replace("s","a")

//Source.fromInputLazyList(new FileInputLazyList(file))).toList

//filteredFiles.length
//filteredFiles.head.getLines().toList


//val x = d.listFiles().toList.take(3)
//val t = Source.fromFile(x(1))
//val file = new FileInputLazyList(x(1))
//val fileInputLazyList = Source.fromInputLazyList(file)

//fileInputLazyList.getLines().map{
//  x=>
//    x.replace("package", "aaa")
//
//}.toList
//fileInputLazyList.close()
//new File(PATH + "/PartItfTypeLib"+"/aaaaa.txt")
//val writer = new FileWriter(new File(PATH + "/PartItfTypeLib" + "/aaaaa.txt"))

//fileInputLazyList.getLines().toList
///writer.write("aa")
//writer.close
//writer.write("a")
//.close()
//val ans = for (line <- fileInputLazyList.getLines)
//  yield (line.replace("package", "aaa"))


//.toList(1).replace("package","aaa")
//val line = t.getLines().toList(1).replace("package","aaa")
//Source.fromInputLazyList(getClass.getResourceAsLazyList(x(1)))

//if (d.exists && d.isDirectory) {
//  d.listFiles.filter(_.isFile).toList
//} else {
//  List[File]()
//}

//val source: Source = Source.fromString("./src/main/java/PartItfTypeLib")
//source.
//val path = getClass.("/src/main/java/PartItfTypeLib")
//val folder = new File(path.getPath)
//if (folder.exists && folder.isDirectory)
//  folder.listFiles
//    .toList
//    .foreach(file => println(file.getName))


object comImportHelper {
  def insertImports: Unit = {

    def lastContainingLineIndex(file: File, string: String) = {
      val lines: Stream[String] = Source.fromFile(file).getLines().toStream
      lines.lastIndexWhere(_.contains(string))
    }

    def insert(list: List[Any], i: Int, value: Any): List[Any] = list match {
      case head :: tail if i > 0 => head :: insert(tail, i - 1, value)
      case _ => value :: list
    }

    val PATH = "/C:/Users/pawel/Desktop/CatiaV5Com4j/src/main/java/CatiaV5TypeLibs/MecModTypeLib"
    val folder = new File(PATH /* + "/PartItfTypeLib"*/)

    val fileInsertPlace: List[(File, Int)] = (for {
      file <- folder.listFiles()
    } yield (file, lastContainingLineIndex(file, "package"))).toList


    val inserted = for {
      (file, index) <- fileInsertPlace
    } yield {
      val lines = Source.fromFile(file).getLines().toList
      (file, insert(lines, index + 1, "import CatiaV5TypeLibs.KnowledgewareTypeLib.*;"))
    }


/*    val operation: Unit = inserted.map({ case (file, lines) => {
      val writer = new FileWriter(File)
      val newContent = lines.map(x => x + "\n").flatten.toArray
      writer.write(newContent)
      writer.close
    }
    })*/
  }

  def filesIntersection(file1: File, file2: File): List[File] = {
    val file1Files = file1.listFiles()
    val file2Files = file2.listFiles()
    val file2FilesNames = file2Files.map(_.getName)

    (for {
      file <- file1Files
      if file2FilesNames contains file.getName
    } yield file).toList

  }


  def filesIntersection(path1: String, path2: String): List[File] = {
    val file1 = new File(path1)
    val file2 = new File(path2)

    filesIntersection(file1, file2)
  }

}


