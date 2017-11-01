name := "lab1_lib"

organization := "se.kth.spark"

version := "1.0"

scalaVersion := "2.11.1"

//resolvers += Resolver.mavenLocal

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.2.0" % "provided"
libraryDependencies += "org.log4s" %% "log4s" % "1.3.3" % "provided"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
