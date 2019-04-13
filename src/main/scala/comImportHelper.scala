import java.io.File

import CatiaV5TypeLibs.InfItfTypeLib.Files


trait comImportHelper {

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

trait fileOrFolder {

}

class folder(inFile: File) extends fileOrFolder {
  val files: List[File] = inFile.listFiles().toList
}

class file(inFile: File) extends fileOrFolder {
  val files: List[File] = Nil
}

