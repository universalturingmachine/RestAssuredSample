plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:5.2.0") // or the latest version
    testImplementation("org.hamcrest:hamcrest:2.2") // For assertions (used by RestAssured)
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2") // For JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.2") // For JUnit 5 test engine
}

tasks.test {
    useJUnitPlatform()
}