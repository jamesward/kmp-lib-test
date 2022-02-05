plugins {
    kotlin("multiplatform") version "1.6.10"
    id("maven-publish")
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

kotlin {
    jvm {
        withJava()
    }
}

group = "com.jamesward"
version = "0.0.1"
