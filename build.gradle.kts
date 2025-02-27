val kotlin_version: String by extra
buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.9.24"
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
}
plugins {
    id 'java'
}
apply {
    plugin("kotlin")
}

group 'ru.netology'
version '1.0-SNAPSHOT'

allprojects {
    repositories {
        mavenCentral()
    }
}
subprojects {
    apply plugin: 'java'

    group = 'ru.netology'
    version = '1.0-SNAPSHOT'

    repositories {
        mavenCentral()
    }
}
dependencies {
    implementation(kotlinModule("stdlib", kotlin_version))
}
repositories {
    mavenCentral()
}