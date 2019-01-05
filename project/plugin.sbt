addSbtPlugin("io.github.gitbucket" % "sbt-gitbucket-plugin" % "1.4.0"  exclude("org.slf4j", "slf4j-jdk14"))
// addSbtPlugin("com.github.stonexx.sbt" % "sbt-webpack"        % "1.3.1")
resolvers += Resolver.jcenterRepo
addSbtPlugin("com.eltimn" % "sbt-frontend" % "1.1.0")