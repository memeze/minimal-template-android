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

    implementation(Libs.Core.ktx)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.Google.material)

    api(Libs.Network.retrofit)
    api(Libs.Network.retrofitConverterGson)
    api(Libs.Network.okhttp)
    api(Libs.Network.okhttpLoggingInterceptor)

    implementation(Libs.Hilt.android)
    kapt(Libs.Hilt.androidCompiler)
    implementation(Libs.Hilt.workManager)
    kapt(Libs.Hilt.compiler)

    implementation(Libs.timber)

    testImplementation(Libs.Junit.junit)
    androidTestImplementation(Libs.AndroidTest.espresso)
}