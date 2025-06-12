plugins {
    kotlin("jvm") version "1.9.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

application {
    // Use `-PmainClass=your.package.YourFileKt` to override this
    val selectedMainClass = project.findProperty("mainClass") as String? ?:  "part1.HundredThousandCoroutinesKt"
    mainClass.set(selectedMainClass)
}
