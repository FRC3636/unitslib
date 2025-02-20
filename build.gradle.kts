plugins {
    kotlin("jvm") version "2.1.0"
    `java-library`
    id("edu.wpi.first.wpilib.repositories.WPILibRepositoriesPlugin") version "2025.0"
}

group = "com.frcteam3636"
version = "0.1.0"

repositories {
    mavenCentral()
}

if (project.hasProperty("releaseMode")) {
    wpilibRepositories.addAllReleaseRepositories(project)
} else {
    wpilibRepositories.addAllDevelopmentRepositories(project)
}

dependencies {
    val wpilibVersion = "2025.+"
//    implementation("edu.wpi.first.cscore:cscore-java:$wpilibVersion")
//    implementation("edu.wpi.first.cameraserver:cameraserver-java:$wpilibVersion")
//    implementation("edu.wpi.first.ntcore:ntcore-java:$wpilibVersion")
    implementation("edu.wpi.first.wpilibj:wpilibj-java:$wpilibVersion")
    implementation("edu.wpi.first.wpiutil:wpiutil-java:$wpilibVersion")
//    implementation("edu.wpi.first.wpimath:wpimath-java:$wpilibVersion")
    implementation("edu.wpi.first.wpiunits:wpiunits-java:$wpilibVersion")
//    implementation("edu.wpi.first.hal:hal-java:$wpilibVersion")
//    implementation("org.ejml:ejml-simple:0.41")
//    implementation("com.fasterxml.jackson.core:jackson-annotations:2.12.4")
//    implementation("com.fasterxml.jackson.core:jackson-core:2.12.4")
//    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.4")
//    implementation("edu.wpi.first.thirdparty.frc2023.opencv:opencv-java:4.6.0-2")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

java {
    withSourcesJar()
}
