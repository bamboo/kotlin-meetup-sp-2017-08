plugins {
    application
}

application {
    mainClassName = "my.Application"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    testCompile("junit:junit:4.12")
}

repositories {
    jcenter()
}

task("rebuild") {
    group = "my"
    dependsOn("clean", "assemble")
}

