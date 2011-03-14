import sbt._

class CodecsProject(info: ProjectInfo) extends DefaultProject(info) {

  override def compileOptions = super.compileOptions ++ Seq(Unchecked)

  val scalaTest = "org.scalatest" % "scalatest" % "1.3" % "test" withSources
}
