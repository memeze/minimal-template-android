plugins {
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("com.android.application")
}

android {
    compileSdk = ConfigData.COMPILE_SDK

    defaultConfig {
        applicationId = "com.minimal.template"
        minSdk = ConfigData.MIN_SDK
        targetSdk = ConfigData.TARGET_SDK
        versionCode = ConfigData.VERSION_CODE
        versionName = ConfigData.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.activityCompose)

    implementation(Libs.Accompanist.insets)
    implementation(Libs.Accompanist.insetsUi)
    implementation(Libs.Accompanist.systemUiController)
    implementation(Libs.Accompanist.appCompatTheme)
    implementation(Libs.Accompanist.pager)
    implementation(Libs.Accompanist.pagerIndicators)
    implementation(Libs.Accompanist.swipeRefresh)
    implementation(Libs.Accompanist.placeHolder)
    implementation(Libs.Accompanist.drawablePainter)
    implementation(Libs.Accompanist.flowLayout)
    implementation(Libs.Accompanist.permissions)
    implementation(Libs.Accompanist.navigationAnimation)
    implementation(Libs.Accompanist.navigationMaterial)

    implementation(Libs.Compose.ui)
    debugImplementation(Libs.Compose.tooling)
    implementation(Libs.Compose.preview)
    implementation(Libs.Compose.material)
    androidTestImplementation(Libs.Compose.test)

    implementation(Libs.Core.ktx)
    implementation(Libs.Core.splash)

    implementation(Libs.Google.material)

    implementation(Libs.Hilt.android)
    kapt(Libs.Hilt.androidCompiler)
    implementation(Libs.Hilt.workManager)
    kapt(Libs.Hilt.compiler)

    implementation(Libs.Lifecycle.viewmodel)
    implementation(Libs.Lifecycle.viewmodelCompose)
    implementation(Libs.Lifecycle.livedata)
    implementation(Libs.Lifecycle.runtime)
    implementation(Libs.Lifecycle.viewmodelSavedState)
    kapt(Libs.Lifecycle.compiler)
    implementation(Libs.Lifecycle.common)

    implementation(Libs.Navigation.ui)
    implementation(Libs.Navigation.compose)
    androidTestImplementation(Libs.Navigation.testing)

    implementation(Libs.timber)

    testImplementation(Libs.Junit.junit)
    androidTestImplementation(Libs.AndroidTest.espresso)
}