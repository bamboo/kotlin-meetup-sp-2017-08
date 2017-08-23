package my

import org.gradle.api.*
import org.gradle.api.plugins.*

open class Build : Plugin<Project> {

    override fun apply(project: Project): Unit = project.run {

        apply { it.plugin("application") }

        convention.getPlugin(ApplicationPluginConvention::class.java).apply {
            mainClassName = "my.Application"
        }

        convention.getPlugin(JavaPluginConvention::class.java).apply {
            sourceCompatibility = JavaVersion.VERSION_1_7
            targetCompatibility = JavaVersion.VERSION_1_7
        }

        dependencies.apply {
            add("testCompile", "junit:junit:4.12")
        }

        repositories.apply {
            jcenter()
        }

        tasks.create("rebuild") {
            it.group = "my"
            it.dependsOn("clean", "assemble")
        }
    }
}