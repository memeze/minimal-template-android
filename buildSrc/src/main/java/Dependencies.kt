/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.GRADLE_PLUGIN}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}" }
}

/**
 * To defines dependencies
 */
object Deps {
    object AndroidX {
        val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.APPCOMPAT}" }
        val dataStore by lazy { "androidx.datastore:datastore-preferences:${Versions.DATASTORE}" }
        val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}" }
        val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.ACTIVITY}" }
        val activityKtx by lazy { "androidx.activity:activity-ktx:${Versions.ACTIVITY}" }
        val fragmentKtx by lazy { "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}" }
    }

    object Accompanist {
        val insets by lazy { "com.google.accompanist:accompanist-insets:${Versions.ACCOMPANIST}" }
        val insetsUi by lazy { "com.google.accompanist:accompanist-insets-ui:${Versions.ACCOMPANIST}" }
        val systemUiController by lazy { "com.google.accompanist:accompanist-insets-ui:${Versions.ACCOMPANIST}" }
        val appCompatTheme by lazy { "com.google.accompanist:accompanist-appcompat-theme:${Versions.ACCOMPANIST}" }
        val pager by lazy { "com.google.accompanist:accompanist-pager:${Versions.ACCOMPANIST}" }
        val pagerIndicators by lazy { "com.google.accompanist:accompanist-pager-indicators:${Versions.ACCOMPANIST}" }
        val swipeRefresh by lazy { "com.google.accompanist:accompanist-swiperefresh:${Versions.ACCOMPANIST}" }
        val placeHolder by lazy { "com.google.accompanist:accompanist-placeholder-material:${Versions.ACCOMPANIST}" }
        val drawablePainter by lazy { "com.google.accompanist:accompanist-drawablepainter:${Versions.ACCOMPANIST}" }
        val flowLayout by lazy { "com.google.accompanist:accompanist-flowlayout:${Versions.ACCOMPANIST}" }
        val permissions by lazy { "com.google.accompanist:accompanist-permissions:${Versions.ACCOMPANIST}" }
        val navigationAnimation by lazy { "com.google.accompanist:accompanist-navigation-animation:${Versions.ACCOMPANIST}" }
        val navigationMaterial by lazy { "com.google.accompanist:accompanist-navigation-material:${Versions.ACCOMPANIST}" }
    }

    object Compose {
        val ui by lazy { "androidx.compose.ui:ui:${Versions.COMPOSE}" }
        val tooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}" }
        val preview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}" }
        val material by lazy { "androidx.compose.material:material:${Versions.COMPOSE}" }
    }

    object Core {
        val ktx by lazy { "androidx.core:core-ktx:${Versions.CORE_KTX}" }
        val splash by lazy { "androidx.core:core-splashscreen:${Versions.SPLASH}" }
    }

    object Glide {
        val glide by lazy { "com.github.bumptech.glide:glide:${Versions.GLIDE}" }
        val compiler by lazy { "com.github.bumptech.glide:compiler:${Versions.GLIDE}" }
    }

    object Google {
        val material by lazy { "com.google.android.material:material:${Versions.MATERIAL}" }
    }

    object Hilt {
        val android by lazy { "com.google.dagger:hilt-android:${Versions.HILT}" }
        val compiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.HILT}" }
    }

    object Koin {
        val android by lazy { "io.insert-koin:koin-android:${Versions.KOIN}" }
        val compose by lazy { "io.insert-koin:koin-androidx-compose:${Versions.KOIN}" }
        val workmanager by lazy { "io.insert-koin:koin-androidx-workmanager:${Versions.KOIN}" }
    }

    object Lifecycle {
        val common by lazy { "androidx.lifecycle:lifecycle-common-java8:${Versions.Lifecycle.COMMON}" }
        val runtime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Lifecycle.COMMON}" }
        val viewmodel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Lifecycle.COMMON}" }
        val livedata by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Lifecycle.COMMON}" }
        val extensions by lazy { "androidx.lifecycle:lifecycle-extensions:${Versions.Lifecycle.EXTENSIONS}" }
    }

    object Navigation {
        val fragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.Navigation.COMMON}" }
        val ui by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.Navigation.COMMON}" }
        val compose by lazy { "androidx.navigation:navigation-compose:${Versions.Navigation.COMPOSE}" }
        val testing by lazy { "androidx.navigation:navigation-testing:${Versions.Navigation.COMMON}" }
    }

    object Room {
        val ktx by lazy { "androidx.room:room-ktx:${Versions.ROOM}" }
        val runtime by lazy { "androidx.room:room-runtime:${Versions.ROOM}" }
        val compiler by lazy { "androidx.room:room-compiler:${Versions.ROOM}" }
    }

    object Test {
        val junit by lazy { "junit:junit:${Versions.JUNIT}" }
        val room by lazy { "androidx.room:room-testing:${Versions.ROOM}" }
        val koin by lazy { "io.insert-koin:koin-test-junit4:${Versions.KOIN}" }
    }

    object AndroidTest {
        val junit by lazy { "androidx.test.ext:junit:1.1.3" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:3.4.0" }
        val compose by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}" }
    }

    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}" }
}