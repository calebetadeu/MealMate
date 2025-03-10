package com.calebtadeu.convention

import com.android.build.api.dsl.BuildType
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureBuildTypes(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    extensionType: ExtensionType
) {
    commonExtension.run {
        buildFeatures {
            buildConfig = true
        }

//        val apiKey = gradleLocalProperties(rootDir, rootProject.providers).getProperty("API_KEY")
//        when(extensionType) {
//            ExtensionType.APPLICATION -> {
//                extensions.configure<ApplicationExtension> {
//                    buildTypes {
//                        debug {
//                            configureDebugBuildType(apiKey)
//                        }
//                        release {
//                            configureReleaseBuildType(commonExtension, apiKey)
//                        }
//                    }
//                }
//            }
//            ExtensionType.LIBRARY -> {
//                extensions.configure<LibraryExtension> {
//                    buildTypes {
//                        debug {
//                            configureDebugBuildType(apiKey)
//                        }
//                        release {
//                            configureReleaseBuildType(commonExtension, apiKey)
//                        }
//                    }
//                }
//            }
//            ExtensionType.DYNAMIC_FEATURE -> {
//                extensions.configure<DynamicFeatureExtension> {
//                    buildTypes {
//                        debug {
//                            configureDebugBuildType(apiKey)
//                        }
//                        release {
//                            configureReleaseBuildType(commonExtension, apiKey)
//                            isMinifyEnabled = false
//                        }
//                    }
//                }
//            }
//        }
    }
}

private fun BuildType.configureDebugBuildType(apiKey: String) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"https://runique.pl-coding.com:8080\"")
}

private fun BuildType.configureReleaseBuildType(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    apiKey: String
) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"https://runique.pl-coding.com:8080\"")

    isMinifyEnabled = true
    proguardFiles(
        commonExtension.getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
    )
}