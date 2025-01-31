plugins {
    id("net.kyori.blossom") version "1.3.0"
}

dependencies {
    implementation("com.maxmind.geoip2:geoip2:2.16.1")
    implementation("org.apache.commons:commons-compress:1.21")
    implementation("org.apache.commons:commons-text:1.9")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.spongepowered:configurate-hocon:4.1.2")
    implementation("org.jetbrains:annotations:23.0.0")
    implementation("com.zaxxer:HikariCP:5.0.1")

    compileOnly("net.kyori:adventure-api:4.10.1")
    compileOnly("net.kyori:adventure-text-serializer-legacy:4.10.1")
    compileOnly("org.apache.logging.log4j:log4j-core:2.17.1")
    compileOnly("org.slf4j:slf4j-api:1.7.30")
}

blossom {
    replaceToken("{version}", project.version, "src/main/java/me/xneox/epicguard/core/util/VersionUtils.java")
}