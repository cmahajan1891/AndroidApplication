package com.example.androidapplication.fragments

import com.example.androidapplication.R

class ItemsFragment : BaseFragment() {
      override val logTag = "Items fragment" 
      override fun getLayout(): Int { 
        return R.layout.fragment_items
      }
}