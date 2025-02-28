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
//        register("androidApplicationCompose") {
//            id = "runique.android.application.compose"
//            implementationClass = "AndroidApplicationComposeConventionPlugin"
//        }
//        register("androidApplicationWearCompose") {
//            id = "runique.android.application.wear.compose"
//            implementationClass = "AndroidApplicationWearComposeConventionPlugin"
//        }
        register("androidLibrary") {
            id = "mealmate.android.library"
            implementationClass = "com.calebtadeu.AndroidLibraryConventionPlugin"
        }
//        register("androidLibraryCompose") {
//            id = "runique.android.library.compose"
//            implementationClass = "AndroidLibraryComposeConventionPlugin"
//        }
//        register("androidFeatureUi") {
//            id = "runique.android.feature.ui"
//            implementationClass = "AndroidFeatureUiConventionPlugin"
//        }
//        register("androidRoom") {
//            id = "runique.android.room"
//            implementationClass = "AndroidRoomConventionPlugin"
//        }
//        register("androidDynamicFeature") {
//            id = "runique.android.dynamic.feature"
//            implementationClass = "AndroidDynamicFeatureConventionPlugin"
//        }
//        register("jvmLibrary") {
//            id = "runique.jvm.library"
//            implementationClass = "JvmLibraryConventionPlugin"
//        }
//        register("jvmKtor") {
//            id = "runique.jvm.ktor"
//            implementationClass = "JvmKtorConventionPlugin"
//        }
    }
}