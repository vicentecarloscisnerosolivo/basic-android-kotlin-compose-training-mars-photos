package com.example.marsphotos

import android.app.Application
import com.example.marsphotos.data.DefaultAppContainer

class MarsPhotoApplication : Application() {
    lateinit var container: DefaultAppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}