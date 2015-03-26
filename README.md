# Simple Seed Webapp
___
## Introduction
___
The purpose of this project is to provide a simple seed application for creating web applications incredibly fast

## Stack
___
 * Spring 4.0
 * Jersey
 * Jetty

## Gradle Wrapper
This project uses the gradle wrapper so that all you need to do is have a JDK and it will do the rest, all commands begin with gradlew. If you don't have the version of gradle specified in the build.gradle it will download it for you.
```groovy
./gradlew clean build
``` 

## Eclipse
Its best to use the Gradle Eclipse plugin to set up classpaths and workspace correctly
```groovy
./gradlew cleanEclipse eclipse
```

## Gretty
___
Gretty is a plugin that will allow easy deployment of the web app to an embedded Jetty or Tomcat instance. Further reading, check out the excellent [documentation](https://github.com/akhikhl/gretty)  
###Usage
```groovy
./gradlew runApp
```
This will start up the application, default is (http://localhost:9080/seed-webapp).  This is the quintessential [Hello World!](http://localhost:9080/seed-webapp/hello-world) Page.

