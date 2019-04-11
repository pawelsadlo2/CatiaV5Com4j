import java.io.{File, FileInputStream, FileWriter, PrintWriter}

import scala.collection.immutable.Map.Map1
import scala.io.Source

new Map1()


val PATH = "/C:/Users/pawel/Desktop/CatiaV5Com4j/src/main/resources/CatiaV5TypeLibs/PartItfTypeLib"
val folder = new File(PATH /* + "/PartItfTypeLib"*/)
val folders =  new packageHelper


val fileInsertPlace: List[(File, Int)] = (for {
  file <- folder.listFiles()
} yield (file, lastContainingLineIndex(file, "import"))).toList

def lastContainingLineIndex(file: File, string: String) = {
  val lines: Stream[String] = Source.fromFile(file).getLines().toStream
  lines.lastIndexWhere(_.contains(string))
}

val inserted = for {
  (file, index) <- fileInsertPlace
} yield {
  val lines = Source.fromFile(file).getLines().toList
  (file, insert(lines, index + 1, "import CatiaV5TypeLibs.InfItfTypeLib.*;"))
}

def insert(list: List[Any], i: Int, value: Any): List[Any] = list match {
  case head :: tail if i > 0 => head :: insert(tail, i - 1, value)
  case _ => value :: list
}

val operation: Unit = inserted.map({ case (file, lines) => {
  val writer = new FileWriter(file)
  val newContent = lines.map(x => x + "\n").flatten.toArray
  writer.write(newContent)
  writer.close
}
})

//val writer = new FileWriter(file)
//writer.write("import CatiaV5TypeLibs.InfItfTypeLib.*;\n")
//writer.write("xx")
//writer.close


//line.replace("s","a")

//Source.fromInputStream(new FileInputStream(file))).toList

//filteredFiles.length
//filteredFiles.head.getLines().toList


//val x = d.listFiles().toList.take(3)
//val t = Source.fromFile(x(1))
//val file = new FileInputStream(x(1))
//val fileInputStream = Source.fromInputStream(file)

//fileInputStream.getLines().map{
//  x=>
//    x.replace("package", "aaa")
//
//}.toList
//fileInputStream.close()
//new File(PATH + "/PartItfTypeLib"+"/aaaaa.txt")
val writer = new FileWriter(new File(PATH + "/PartItfTypeLib" + "/aaaaa.txt"))
//fileInputStream.getLines().toList
///writer.write("aa")
//writer.close
//writer.write("a")
//.close()
//val ans = for (line <- fileInputStream.getLines)
//  yield (line.replace("package", "aaa"))


//.toList(1).replace("package","aaa")
//val line = t.getLines().toList(1).replace("package","aaa")
//Source.fromInputStream(getClass.getResourceAsStream(x(1)))

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


