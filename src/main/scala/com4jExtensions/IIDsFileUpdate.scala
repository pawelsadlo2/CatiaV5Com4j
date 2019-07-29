package com4jExtensions

import java.io.File
import scala.io.Source
import CatiaV5TypeLibs._

object IIDsFileUpdate {

  val IIDsFile: Source = Source.fromResource("IIDs.txt")
  val typeLibsPath: String = "/C:/Users/pawel/Desktop/CatiaV5Com4j/src/main/java/CatiaV5TypeLibs/"
  val typeLibsFolder: File = new File(typeLibsPath)

  def getIIdsList(folder: File): List[String] = {
    val filesList: List[File] = folder.listFiles().toList
    filesList.foldLeft(List(): List[String])(
      (IIdsList: List[String], file: File) =>
        if (file.isDirectory) IIdsList ++ getIIdsList(file)
        else IIdsList ++ List(getIIdLine(file)).filterNot(_ == "")

    )
  }

  def readFileContents(file: File): Stream[String] = {
    val fileSource = Source.fromFile(file)
    fileSource.getLines().toStream

  }

  def getIIdLine(file: File): String = {
    val filtered = readFileContents(file).filter(_.contains("@IID"))
    val iid = filtered.headOption.getOrElse("")
    iid
  }
}
