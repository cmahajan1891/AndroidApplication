package com.example.androidapplication.activities

import android.os.Bundle
import android.support.v4.app.FragmentActivity

abstract class BaseActivity : FragmentActivity() {
    protected abstract val tag : String
    protected abstract fun getLayout(): Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }
}
