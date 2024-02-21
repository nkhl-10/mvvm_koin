plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "mvvm.app.koin"
    compileSdk = 33

    defaultConfig {
        applicationId = "mvvm.app.koin"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



//    // Koin Android features
//    implementation ("org.koin:koin-core:3.2.0")
//    implementation ("org.koin:koin-android:3.2.0")
//
//    // Koin for dependency injection
//    implementation ("org.koin:koin-androidx-viewmodel:3.2.0")
//

    implementation ("org.koin:koin-android:3.2.0")
    implementation ("org.koin:koin-android-viewmodel:3.2.0")
    implementation ("org.koin:koin-androidx-scope:3.2.0")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")


// Room for local database
    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")

// Retrofit for network requests
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

}