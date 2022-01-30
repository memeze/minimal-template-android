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

    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.activityCompose)

    implementation(Deps.Accompanist.insets)
    implementation(Deps.Accompanist.insetsUi)
    implementation(Deps.Accompanist.systemUiController)
    implementation(Deps.Accompanist.appCompatTheme)
    implementation(Deps.Accompanist.pager)
    implementation(Deps.Accompanist.pagerIndicators)
    implementation(Deps.Accompanist.swipeRefresh)
    implementation(Deps.Accompanist.placeHolder)
    implementation(Deps.Accompanist.drawablePainter)
    implementation(Deps.Accompanist.flowLayout)
    implementation(Deps.Accompanist.permissions)
    implementation(Deps.Accompanist.navigationAnimation)
    implementation(Deps.Accompanist.navigationMaterial)

    implementation(Deps.Compose.ui)
    implementation(Deps.Compose.material)
    implementation(Deps.Compose.preview)
    debugImplementation(Deps.Compose.tooling)

    implementation(Deps.Core.ktx)
    implementation(Deps.Core.splash)

    implementation(Deps.Google.material)

    implementation(Deps.Hilt.android)
    kapt(Deps.Hilt.compiler)

    implementation(Deps.Lifecycle.runtime)

    implementation(Deps.Navigation.compose)

    testImplementation(Deps.Test.junit)
    androidTestImplementation(Deps.AndroidTest.junit)
    androidTestImplementation(Deps.AndroidTest.espresso)
    androidTestImplementation(Deps.AndroidTest.compose)
}