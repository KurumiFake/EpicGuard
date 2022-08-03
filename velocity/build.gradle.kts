dependencies {
    implementation(project(":core"))

    // TODO: Download these on runtime.
    implementation("mysql:mysql-connector-java:8.0.29")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")

    compileOnly("com.velocitypowered:velocity-api:3.1.1")
    annotationProcessor("com.velocitypowered:velocity-api:3.1.1")
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}
