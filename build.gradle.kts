group = "your.group.name"
version = "0.0.1"
description = "Asd"
val projectName = "ProjectName"
val authors = listOf("Author1")

// Any extra variables accessible to resources
val extras = mapOf(
  "projectName" to projectName,
  "main" to "${project.group}.${projectName.toLowerCase()}.${projectName}",
  "authors" to authors.joinToString(", ")
)

extra.apply { extras.forEach { (key, value) -> set(key, value) }}

plugins {
  id("java")
}

java {
  toolchain {
      languageVersion.set(JavaLanguageVersion.of(17))
  }
}

repositories {
  mavenCentral()
  maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
  compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

tasks {
  processResources {
    filesMatching("**/plugin.yml") {
      expand(project.properties)
    }
  }
  compileJava {
    options.encoding = "UTF-8"
  }
}





