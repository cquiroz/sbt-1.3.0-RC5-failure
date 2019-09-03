name := "Sbt sample"
scalaVersion := "2.12.9" // or any other Scala version >= 2.10.2

resolvers in ThisBuild += "Gemini Repository" at "https://github.com/gemini-hlsw/maven-repo/raw/master/releases"

val Squants = "org.typelevel" %% "squants" % "1.4.0"
val SpModelCore = "edu.gemini.ocs" %% "edu-gemini-spmodel-core" % "2019101.1.3"

libraryDependencies += Squants
libraryDependencies += SpModelCore // This depends on squants 0.6.3
