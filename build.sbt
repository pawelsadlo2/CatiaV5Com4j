name := "CatiaV5Com4j"

version := "0.1"

scalaVersion := "2.13.0"


// https://mvnrepository.com/artifact/org.jvnet.com4j/com4j
libraryDependencies ++= Seq(
  "org.jvnet.com4j" % "com4j" % "latest.integration",
  "org.reflections" % "reflections" % "latest.integration",
  // https://mvnrepository.com/artifact/net.java.dev.jna/jna
  "net.java.dev.jna" % "jna" % "latest.integration",
  // https://mvnrepository.com/artifact/org.scala-lang/scala-reflect
  "org.scala-lang" % "scala-reflect" % "latest.integration"

)

scalacOptions := Seq("-unchecked", "-deprecation")
