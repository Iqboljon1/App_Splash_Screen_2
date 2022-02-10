package com.ir.appsplashscreen2.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ir.appsplashscreen2.DataClassSpash.DataClassSplash
import com.ir.appsplashscreen2.SplahFragment

class MyAdapterPager (var arrayListSplash: ArrayList<DataClassSplash> , var fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = arrayListSplash.size

    override fun createFragment(position: Int): Fragment {
        return SplahFragment.newInstance(arrayListSplash[position].stringName , arrayListSplash[position].stringDescription , arrayListSplash[position].image.toString() , position.toString())
    }
}