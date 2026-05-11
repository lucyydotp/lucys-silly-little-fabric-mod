plugins {
    id("fabric-loom") version "1.16-SNAPSHOT"
}

version = "1.0.2"
group = "me.lucyydotp"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(21))

dependencies {
    minecraft("com.mojang:minecraft:1.21.11")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.15.7")

}

tasks.processResources {
    filteringCharset = "UTF-8"

    filesMatching("fabric.mod.json") {
        expand("version" to project.version)
    }
}
