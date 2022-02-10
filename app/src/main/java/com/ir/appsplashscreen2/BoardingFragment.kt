package com.ir.appsplashscreen2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.ir.appsplashscreen2.Adapters.MyAdapterPager
import com.ir.appsplashscreen2.DataClassSpash.DataClassSplash
import com.ir.appsplashscreen2.databinding.FragmentBoardingBinding

class BoardingFragment : Fragment() {
    lateinit var binding: FragmentBoardingBinding
    lateinit var myAdapterPager: MyAdapterPager
    lateinit var arrayList: ArrayList<DataClassSplash>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBoardingBinding.inflate(layoutInflater)
        arrayList = ArrayList()
        arrayList.add(DataClassSplash("Click va Paymega o’tish xizmati" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum." , R.drawable.bitmap_1_jpg_4px))
        arrayList.add(DataClassSplash("Barcha operatorlar bo’yicha statistika" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum." , R.drawable.bitmap_2_jpg_4px))
        arrayList.add(DataClassSplash("Tariflarni filtrlash" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum." , R.drawable.bitmap_4_jpg_4px))
        arrayList.add(DataClassSplash("Yangi imkoniyatlar" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum." , R.drawable.bitmap_3_jpg_4px))
        myAdapterPager = MyAdapterPager(arrayList , requireActivity())
        binding.viewPager.adapter = myAdapterPager

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { _, _ ->
        }.attach()

        return binding.root
    }

}