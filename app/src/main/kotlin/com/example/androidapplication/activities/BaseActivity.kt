package com.example.androidapplication.activities

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_header.*

abstract class BaseActivity : FragmentActivity() {
    protected abstract val tag: String
    protected abstract fun getLayout(): Int
    protected abstract fun getActivityTitle(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        activity_title.setText(getActivityTitle())
    }
}
