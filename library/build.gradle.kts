import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    id("maven-publish")
    alias(libs.plugins.vanniktechMavenPublish)
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
        }
    }

    jvm("desktop")

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.ui)
        }
    }
}

android {
    namespace = "dev.seyfarth.tablericons"
    compileSdk = 36
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates("dev.seyfarth", "tabler-icons-kmp", "1.0.0")

    pom {
        name.set("Tabler Icons KMP")
        description.set("6000+ Tabler Icons for Kotlin Multiplatform")
        inceptionYear.set("2025")
        url.set("https://github.com/timoseyfarth/tabler-icons-kmp")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
                distribution.set("repo")
            }
        }
        developers {
            developer {
                id.set("timoseyfarth")
                name.set("Timo Seyfarth")
                email.set("timo@seyfarth.dev")
                url.set("https://timo.seyfarth.dev")
            }
        }
        scm {
            url.set("https://github.com/timoseyfarth/tabler-icons-kmp")
            connection.set("scm:git:git://github.com/timoseyfarth/tabler-icons-kmp.git")
            developerConnection.set("scm:git:ssh://github.com/timoseyfarth/tabler-icons-kmp.git")
        }
    }
}
