import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    jvm("desktop")
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        outputModuleName = "themeSampleApp"
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputPath = file("$rootDir/docs")
                outputFileName = "themeSampleApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
            this.webpackTask {
                this.mainOutputFileName = "caca"
            }
        }
        binaries.executable()
    }

    sourceSets {
        val desktopMain by getting
        val wasmJsMain by getting

        commonMain.dependencies {
            implementation(project(":theme"))
            implementation(compose.material3)
        }

        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
    }

    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    compilerOptions {
        freeCompilerArgs.add("-Xopt-in=kotlin.time.ExperimentalTime")
    }
}

compose.desktop {
    application {
        mainClass = "com.cacaosd.kmp_ui_foundation.sample.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.cacaosd.kmp_ui_foundation.sample"
            packageVersion = "1.0.0"
        }
    }
}

val copyWasmResources by tasks.registering(Copy::class) {
    from("$projectDir/src/wasmJsMain/resources")
    into("$rootDir/docs")
}

tasks.named("wasmJsBrowserDistribution") {
    finalizedBy(copyWasmResources)
}

