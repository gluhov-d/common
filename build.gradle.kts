plugins {
    java
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

group = "com.github.gluhov"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("javax.validation:validation-api:2.0.1.Final")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.0")
}

tasks.jar {
    archiveFileName.set("common-${project.version}.jar")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "com.github.gluhov"
            artifactId = "common"
            version = "1.0.0"
        }
    }
    repositories {
        mavenLocal()
    }
}