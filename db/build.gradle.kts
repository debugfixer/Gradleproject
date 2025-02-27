plugins {
    id("java")
}

group 'ru.netology'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.apache.commons:commons-lang3:3.12.0'
}


tasks.test {
    useJUnitPlatform()
}