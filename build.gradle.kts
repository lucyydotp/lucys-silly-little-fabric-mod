plugins {
    id("fabric-loom") version "1.1-SNAPSHOT"
}

version = "1.0.0-SNAPSHOT"
group = "net.lucypoulton"


dependencies {
    minecraft("com.mojang:minecraft:1.20")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.14.21")

}

tasks.processResources {
    filesMatching("fabric.mod.json") {
        expand("version" to project.version)
    }
}
