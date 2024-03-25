plugins {
    id("fabric-loom") version "1.1-SNAPSHOT"
}

version = "1.0.1"
group = "net.lucypoulton"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))

dependencies {
    minecraft("com.mojang:minecraft:1.20.4")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.15.7")

}

tasks.processResources {
    filteringCharset = "UTF-8"

    filesMatching("fabric.mod.json") {
        expand("version" to project.version)
    }
}
