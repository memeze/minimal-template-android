plugins {
    id("com.android.application")
    id("kotlin-android")
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
    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.activityCompose)

    implementation(Deps.Compose.ui)
    implementation(Deps.Compose.material)
    implementation(Deps.Compose.preview)
    debugImplementation(Deps.Compose.tooling)

    implementation(Deps.Core.ktx)
    implementation(Deps.Core.splash)

    implementation(Deps.Google.material)

    implementation(Deps.Lifecycle.runtime)

    implementation(Deps.Navigation.compose)

    testImplementation(Deps.Test.junit)
    androidTestImplementation(Deps.AndroidTest.junit)
    androidTestImplementation(Deps.AndroidTest.espresso)
    androidTestImplementation(Deps.AndroidTest.compose)
}