rootProject.name = "tabler-icons-parent"

include(":tabler-icons-kmp")
project(":tabler-icons-kmp").projectDir = file("library")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
