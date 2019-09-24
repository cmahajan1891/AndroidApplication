package com.example.androidapplication.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.androidapplication.R
import com.example.androidapplication.fragments.ItemsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override val tag = "Main activity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    /*
    * This block of code is for fragment stack.
    * */

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val fragment = ItemsFragment()
//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.fragment_container, fragment)
//            .commit()
//        filter_menu.text = "H"
//        filter_menu.setOnClickListener {
//            val userManualFrg = ManualFragment()
//            supportFragmentManager
//                .beginTransaction()
//                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
//                .replace(R.id.fragment_container, userManualFrg)
//                .addToBackStack("User manual")
//                .commit()
//        }
//    }

    /*
    * This block of code is for view pager fragment
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pager.adapter = ViewPagerAdapter(supportFragmentManager)
    }

    private class ViewPagerAdapter(manager: FragmentManager) :
        FragmentStatePagerAdapter(manager) {
        override fun getItem(position: Int): Fragment {
            return ItemsFragment()
        }

        override fun getCount(): Int {
            return 5
        }
    }
}
