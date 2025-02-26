plugins {
    id("java")
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
    implementation project(':service')
}


tasks.test {
    useJUnitPlatform()
}