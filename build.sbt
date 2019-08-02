name := "CatiaV5Com4j"

version := "0.1"

scalaVersion := "2.13.0"

// https://mvnrepository.com/artifact/org.jvnet.com4j/com4j
libraryDependencies ++= Seq(
  "org.jvnet.com4j" % "com4j" % "2.1",
  "org.reflections" % "reflections" % "0.9.11",
  // https://mvnrepository.com/artifact/net.java.dev.jna/jna
  "net.java.dev.jna" % "jna" % "5.4.0",
  // https://mvnrepository.com/artifact/org.scala-lang/scala-reflect
  "org.scala-lang" % "scala-reflect" % "2.13.0"

)

scalacOptions := Seq("-unchecked", "-deprecation")
