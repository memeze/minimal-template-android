plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = ConfigData.COMPILE_SDK

    defaultConfig {
        minSdk = ConfigData.MIN_SDK
        targetSdk = ConfigData.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(Deps.Core.ktx)
    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.Google.material)

    api(Deps.Network.retrofit)
    api(Deps.Network.retrofitConverterGson)
    api(Deps.Network.okhttp)
    api(Deps.Network.okhttpLoggingInterceptor)

    implementation(Deps.Hilt.android)
    kapt(Deps.Hilt.androidCompiler)
    implementation(Deps.Hilt.viewModel)
    implementation(Deps.Hilt.workManager)
    kapt(Deps.Hilt.compiler)

    implementation(Deps.timber)

    testImplementation(Deps.Junit.junit)
    androidTestImplementation(Deps.AndroidTest.espresso)
}