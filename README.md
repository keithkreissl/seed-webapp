# Turn Key Webapp
## Introduction
The purpose of this project is to provide a simple seed application for creating web applications incredibly fast

## Stack
 * Spring 4.0
 * Jersey
 * Jetty

## Gradle Wrapper
This project uses the gradle wrapper so that all you need to do is have a JDK and it will do the rest, all commands begin with gradlew. If you don't have the version of gradle specified in the build.gradle it will download it for you.
```
./gradlew clean build
``` 

## Eclipse
Its best to use the Gradle Eclipse plugin to set up classpaths and workspace correctly
```
./gradlew cleanEclipse eclipse
```

## Gretty
Gretty is a plugin that will allow easy deployment of the web app to an embedded Jetty or Tomcat instance. Further reading, check out the excellent [documentation](https://github.com/akhikhl/gretty)  
###Usage
```
./gradlew appRun
```
The quintessential Hello World pages  
 * [Spring Controller Hello World!](http://localhost:9080/turn-key-webapp/hello-world) Page.
 * [Jersey REST Hello World!](http://localhost:9080/turn-key-webapp/rest/hello-world) Page.

