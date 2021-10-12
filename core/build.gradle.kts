import com.android.build.gradle.internal.dsl.BaseFlavor

plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    id(GradlePluginId.KOTLIN_ANDROID) // or kotlin("android") or id 'kotlin-android'
    id(GradlePluginId.KOTLIN_KAPT) // or kotlin("kapt")
    id(GradlePluginId.ANDROID_JUNIT_5)
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)

        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME
        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }


    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }

        getByName(BuildType.DEBUG) {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
        }
    }

    testOptions {
        unitTests.isReturnDefaultValues = TestOptions.IS_RETURN_DEFAULT_VALUES
    }

    buildFeatures.viewBinding = true


    packagingOptions {
        exclude("META-INF/AL2.0")
        exclude("META-INF/licenses/**")
        exclude("**/attach_hotspot_windows.dll")
        exclude("META-INF/LGPL2.1")
    }
}

dependencies {
    // implementation configuration is used here (instead of testImplementation) because this module is added as
    // testImplementation dependency inside other modules. Using implementation allows to write tests for test
    // utilities.
    implementation(libs.bundles.kotlin)
    api(libs.bundles.dagger)
    api(libs.bundles.retrofit)
    api(libs.bundles.okhttp)
    api(libs.bundles.navigation)
    api(libs.bundles.lifecycle)
    api(libs.timber)
    api(libs.coil)
    api(libs.bundles.ktx)


    kapt(libs.dagger.kapt)
    kapt(libs.dagger.annotation)

}

/*
Takes value from Gradle project property and sets it as build config property
 */
fun BaseFlavor.buildConfigFieldFromGradleProperty(gradlePropertyName: String) {
    val propertyValue = project.properties[gradlePropertyName] as String

    val androidResourceName = "GRADLE_${gradlePropertyName.toSnakeCase()}".toUpperCase()
    buildConfigField("String", androidResourceName, propertyValue)
}

fun String.toSnakeCase() = this.split(Regex("(?=[A-Z])")).joinToString("_") { it.toLowerCase() }

