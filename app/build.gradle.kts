/*
 * Copyright 2022 LLC Campus.
 */

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":"))

    implementation(libs.parserTestsSdk)
    implementation(libs.log4jCore)
}
