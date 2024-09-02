import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml
// import xyz.jpenilla.resourcefactory.bukkit.Permission // Example for default permission level

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

dependencies {
  compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
}

repositories {
  mavenCentral()
  maven("https://repo.papermc.io/repository/maven-public/")
}

tasks {
  compileJava {
    options.encoding = "UTF-8"
  }
  bukkitPluginYaml {
    main = "${project.group}.${projectName.lowercase()}.${projectName}"
    load = BukkitPluginYaml.PluginLoadOrder.STARTUP
    authors = listOf("Author1")
    apiVersion = "1.20"
/* Since the plugin has no documentation here's some examples.
    commands.create("examplecommand") {
      description = "Example command description"
      permission = "projectname.examplepermission"
    }
    permissions.create("projectname.examplepermission") {
      description = "Example permission"
      // Not really needed since this is the default anyways
      default = Permission.Default.OP
    }
 */
  }
}
