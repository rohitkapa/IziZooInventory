name := "IziZooInventory"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.2"
//libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.1.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.5.2"
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.5.2"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.5.2"