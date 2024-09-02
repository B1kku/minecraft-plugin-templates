import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml

plugins {
  id("java-library")
  // Generates plugin.yml based on the Gradle config
  id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.1.1"
}

group = "your.group.name"
version = "0.0.1"
description = "Asd"
val projectName = "ProjectName"

java {
  toolchain.languageVersion = JavaLanguageVersion.of(21)
}

repositories {
  mavenCentral()
  maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
  compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
}

tasks {
  bukkitPluginYaml {
    main = "${project.group}.${projectName.lowercase()}.${projectName}"
    load = BukkitPluginYaml.PluginLoadOrder.STARTUP
    authors.add("Author1")
    apiVersion = "1.20"
  }
}
