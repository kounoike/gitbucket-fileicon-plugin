name := "gitbucket-fileicon-plugin"
organization := "io.github.gitbucket"
version := "1.0.1"
scalaVersion := "2.13.4"
gitbucketVersion := "4.35.0"

enablePlugins(FrontendPlugin)
nodePackageManager := sbtfrontend.NodePackageManager.Yarn