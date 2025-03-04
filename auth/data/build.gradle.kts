plugins {
    alias(libs.plugins.mealmate.android.library)
}

android {
    namespace = "com.calebtadeu.data"

}

dependencies {
    implementation(libs.bundles.koin)
}