scalaVersion := "2.11.11"

enablePlugins(ScalaNativePlugin)

libraryDependencies ++= Seq(
	"com.github.alexarchambault" %% "case-app" % "1.2.0-M4",
	"com.github.alexarchambault" %%% "shapeless" % "2.3.3-pre-1"
)
