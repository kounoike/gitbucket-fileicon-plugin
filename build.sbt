name := "gitbucket-fileicon-plugin"
organization := "io.github.gitbucket"
version := "1.0.0"
scalaVersion := "2.12.8"
gitbucketVersion := "4.30.1"

//lazy val root = (project in file(".")).enablePlugins(SbtWeb)
//WebpackKeys.config in webpack := (baseDirectory.value / "webpack.config.js")
//compile in Compile := (compile in Compile).dependsOn(webpack.toTask("")).value

enablePlugins(FrontendPlugin)
nodePackageManager := sbtfrontend.NodePackageManager.Yarn