package com.calebtadeu


import androidx.room.gradle.RoomExtension
import com.calebtadeu.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidFirebaseConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("com.google.gms.google-services")
            }


            dependencies {
                "implementation"(libs.findLibrary("firebase-auth").get())
            }
        }
    }
}