plugins {
    id("java")
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
    implementation project(':db')
}

tasks.test {
    useJUnitPlatform()
}