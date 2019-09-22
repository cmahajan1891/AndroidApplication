package com.example.androidapplication.activities

import com.example.androidapplication.R

class MainActivity : BaseActivity() {
    override fun getLayout(): Int = R.layout.activity_main
    override val tag: String = "MainActivity"
    override fun getActivityTitle() = R.string.app_name

}
