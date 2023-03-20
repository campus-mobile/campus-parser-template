rootProject.name = "campus-parser-template"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        maven {
            url = uri("https://maven.pkg.jetbrains.space/campus/p/public/maven")
            credentials {
                username = "fe830210-7883-4b65-85b4-82cd4a53842e"
                password = "ecd461681bc1eb56ca9daa99c04a29dd019b154d3e61648e03f34399ec1b4fac"
            }
        }
    }
}

include(":app")
