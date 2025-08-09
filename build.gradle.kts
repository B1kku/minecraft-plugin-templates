import xyz.jpenilla.resourcefactory.paper.PaperPluginYaml
// import xyz.jpenilla.resourcefactory.paper.PaperPluginYaml.Load

plugins {
  id("java-library")
  // Generates paper-plugin.yml based on the Gradle config
  id("xyz.jpenilla.resource-factory-paper-convention") version "1.3.0"
}

group = "your.group.name"
version = "0.0.1"
description = "Some description"
val projectName = "ProjectName"
val api = "1.21.8"


java {
  toolchain.languageVersion = JavaLanguageVersion.of(21)
}

repositories {
  mavenCentral()
  maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
  compileOnly("io.papermc.paper:paper-api:${api}-R0.1-SNAPSHOT")
}

tasks {
  compileJava {
    options.encoding = "UTF-8"
  }
  paperPluginYaml {
    name = "${projectName}"
    main = "${project.group}.${projectName.lowercase()}.${projectName}"
    authors = listOf("ExampleAuthor")
    version = "${project.version}"
    apiVersion = "${api}"
    // Examples for some optional settings
    // bootstrapper = "${project.group}.${projectName.lowercase()}.Bootstrapper"
    // prefix = "Example"
    // val serverDeps = listOf("LuckPerms" to Load.BEFORE)
    // dependencies {
    //   serverDeps.forEach { (dep, load) -> server(dep, load)}
    // }
  }
}

