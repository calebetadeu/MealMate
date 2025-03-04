@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    `kotlin-dsl`
}

group = "com.calebtadeumealmate.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)

}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "mealmate.android.application"
            implementationClass = "com.calebtadeu.AndroidApplicationConventionPlugin"
        }

        register("androidLibrary") {
            id = "mealmate.android.library"
            implementationClass = "com.calebtadeu.AndroidLibraryConventionPlugin"

        }
        register("androidFirebase") {
            id = "mealmate.android.firebase"
            implementationClass = "com.calebtadeu.AndroidFirebaseConventionPlugin"
        }
    }
}