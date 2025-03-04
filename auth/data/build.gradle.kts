plugins {
    alias(libs.plugins.mealmate.android.library)
    alias (libs.plugins.mealmate.android.firebase)
}

android {
    namespace = "com.calebtadeu.data"

}

dependencies {
    implementation(libs.bundles.koin)
}