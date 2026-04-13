buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.google.com")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.11.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
    }
}

plugins {
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
