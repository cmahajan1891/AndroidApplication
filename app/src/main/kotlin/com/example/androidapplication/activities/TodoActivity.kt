package com.example.androidapplication.activities

import com.example.androidapplication.R

class TodoActivity : ItemActivity(){
    override val tag = "Todo activity"
    override fun getLayout() = R.layout.activity_todo
}