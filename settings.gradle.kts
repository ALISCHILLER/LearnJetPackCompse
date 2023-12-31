pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "LearnJetPackCompse"
include(":app")
include(":calculator")
include(":scrollablelist")
include(":learntheme")
include(":questionnaire")
include(":basiccomposables")
include(":statelearn")
include(":speedinternttest")
