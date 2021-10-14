import com.android.build.gradle.internal.dsl.DefaultConfig

plugins {
    id(GradlePluginId.ANDROID_APPLICATION)
    id(GradlePluginId.KOTLIN_ANDROID) // or kotlin("android") or id 'kotlin-android'
    id(GradlePluginId.KOTLIN_KAPT) // or kotlin("kapt")
    id(GradlePluginId.KTLINT_GRADLE)
    id(GradlePluginId.SAFE_ARGS)
    id(GradlePluginId.ANDROID_JUNIT_5)
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        applicationId = AndroidConfig.ID
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
        buildToolsVersion(AndroidConfig.BUILD_TOOLS_VERSION)

        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME
        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER

        buildConfigField("FEATURE_MODULE_NAMES", getFeatureNames())
    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }

        getByName(BuildType.DEBUG) {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
        }

        testOptions {
            unitTests.isReturnDefaultValues = TestOptions.IS_RETURN_DEFAULT_VALUES
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }

    // Each feature module that is included in settings.gradle.kts is added here as dynamic feature
    dynamicFeatures = ModuleDependency.getFeatureModules().toMutableSet()

    lintOptions {
        // By default lint does not check test sources, but setting this option means that lint will not even parse them
        isIgnoreTestSources = true
    }

    buildFeatures.viewBinding = true

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(ModuleDependency.CORE))

    // Gradle 7 introduces version catalogs - a new way for sharing dependency versions across projects.
    // Dependencies are defined in gradle.settings.kts file.
    // Code completion problem is fixed in InteliJ IDEA 2021.2 EAP 1 https://youtrack.jetbrains.com/issue/IDEA-266509
    api(libs.bundles.kotlin)

    api(libs.bundles.stetho)

    api(libs.play.core)

    api(libs.constraintLayout)
    api(libs.coordinatorLayout)
    api(libs.appcompat)
    api(libs.recyclerview)
    api(libs.material)
    api(libs.coroutines)
    api(libs.lottie)
    api(libs.bundles.retrofit)

    api(libs.bundles.dagger)
    kapt(libs.dagger.kapt)
    kapt(libs.dagger.annotation)

    testImplementation(project(ModuleDependency.LIBRARY_TEST_UTILS))
    testImplementation(libs.bundles.test)
    testRuntimeOnly(libs.junit.jupiter.engine)
}



/*
Return names of the features
 */
fun getFeatureNames() = ModuleDependency
    .getFeatureModules()
    .map { it.replace(":feature_", "") }
    .toTypedArray()


/*
Adds a new field to the generated BuildConfig class
 */
fun DefaultConfig.buildConfigField(name: String, value: Array<String>) {
    // Create String that holds Java String Array code
    val strValue = value.joinToString(prefix = "{", separator = ",", postfix = "}", transform = { "\"$it\"" })
    buildConfigField("String[]", name, strValue)
}
