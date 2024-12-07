plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.abelmsg.lab13"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.abelmsg.lab13"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    //Activamos el viewBinding , para poder usarlo
    buildFeatures{
        viewBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Aqui traemos las dependencias necesarias para la ejecucion de la camara
    //CameraX core library using camera2 implementation
    implementation("androidx.camera:camera-camera2:1.0.1")
    // CameraX Lifecycle Library
    implementation("androidx.camera:camera-lifecycle:1.0.1")
    // CameraX View class
    implementation("androidx.camera:camera-view:1.0.0-alpha27")
    implementation("com.github.bumptech.glide:glide:4.12.0")
}