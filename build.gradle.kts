plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.13.3"
}

group = "org.exbin.deltahex.intellij"
version = "0.2.8-SNAPSHOT"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2022.2.1")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf("java"))
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    patchPluginXml {
        sinceBuild.set("222.1")
        untilBuild.set("")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}

val binedVersion = "0.2.1-SNAPSHOT"
val pagedDataVersion = "0.2.1-SNAPSHOT"

fun binedLibrary(libName: String): String = ":${libName}-${binedVersion}"

fun pagedDataLibrary(libName: String): String = ":${libName}-${pagedDataVersion}"

repositories {
    flatDir {
        dirs("lib", "lib/jetbrains")
    }
}

dependencies {
    implementation(binedLibrary("bined-core"))
    implementation(binedLibrary("bined-extended"))
    implementation(binedLibrary("bined-highlight-swing"))
    implementation(binedLibrary("bined-operation"))
    implementation(binedLibrary("bined-operation-swing"))
    implementation(binedLibrary("bined-swing"))
    implementation(binedLibrary("bined-swing-extended"))
    implementation(pagedDataLibrary("paged_data"))
    implementation(pagedDataLibrary("paged_data-delta"))
    compileOnly(":debugvalue-clion-2019.2")
    compileOnly(":debugvalue-goland-2022.2.1")
    compileOnly(":debugvalue-intellij-2022.2.1")
    compileOnly(":debugvalue-phpstorm-2022.2.1")
    compileOnly(":debugvalue-pycharm-2019.2")
    compileOnly(":debugvalue-rider-2022.2.1")
}