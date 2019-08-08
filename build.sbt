name := "CatiaV5Com4j"

version := "0.1"

scalaVersion := "2.12.0"
//resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
//addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")
// https://mvnrepository.com/artifact/org.jvnet.com4j/com4j


resolvers += "ScalaFX" at "https://search.maven.org/remotecontent?filepath="
libraryDependencies ++= Seq(
  "org.jvnet.com4j" % "com4j" % "latest.integration",
  //"org.reflections" % "reflections" % "latest.integration",
  // https://mvnrepository.com/artifact/net.java.dev.jna/jna
  "net.java.dev.jna" % "jna" % "latest.integration",
  // https://mvnrepository.com/artifact/org.scala-lang/scala-reflect
  //"org.scala-lang" %% "scala-reflect" % "latest.integration",
  //test
  "org.scalactic" %% "scalactic" % "latest.integration",
  "org.scalatest" %% "scalatest" % "latest.integration" % "test",
  //scalaFX
  // https://mvnrepository.com/artifact/org.scalafx/scalafx
  "org.scalafx" %% "scalafx" % "8.0.144-R12",
  //scala collection compatibility library
  //"org.scala-lang.modules" %% "scala-collection-compat" % "latest.integration",
  //"org.scala-lang.modules" %% "scala-swing" % "2.1.1",
  "com.1stleg" % "jnativehook" % "latest.integration",
   "io.monix" %% "monix-reactive" % "3.0.0-RC3"
)

scalacOptions := Seq("-unchecked", "-deprecation")
