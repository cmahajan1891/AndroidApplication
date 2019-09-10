package com.example.androidapplication

import android.app.Application
import android.content.Context
import android.util.Log

class AndroidApplicationCore : Application() {
    companion object {
        private val tag = "AndroidApplicationCore"
        private var ctx: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
        Log.v(tag, "[ ON CREATE ]")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.w(tag, "[ ON LOW MEMORY ]")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(tag, "[ ON TRIM MEMORY ]: $level")
    }
}
