plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    kotlin("kapt")
    id("kotlin-parcelize")
    alias(libs.plugins.navigation.safeargs)
}

android {
    namespace = "com.kelineyt.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kelineyt.app"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    kapt(libs.hilt.compiler)
    implementation("androidx.navigation:navigation-fragment-ktx:${libs.versions.navigation.get()}")
    implementation("androidx.navigation:navigation-ui-ktx:${libs.versions.navigation.get()}")
    // Loading Button
    implementation(libs.loading.button)

    // Glide
    implementation(libs.glide)

    // CircleImageView
    implementation(libs.circle.imageview)

    // ViewPager Indicator
    implementation(libs.viewpager.indicator)

    // StepView
    implementation(libs.stepview)

    // Navigation
    implementation(libs.navigation.fragment)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}