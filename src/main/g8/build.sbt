name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

resolvers += "twitter" at "http://maven.twttr.com/"

libraryDependencies ++= {
  val finagleVer = "5.3.19"
  Seq(
  "com.twitter" % "finagle-core" % finagleVer,
  "com.twitter" % "finagle-http" % finagleVer,
  "org.specs2" %% "specs2" % "1.12" % "test"
)}

initialCommands := "import $organization$.$name;format="lower,word"$._"