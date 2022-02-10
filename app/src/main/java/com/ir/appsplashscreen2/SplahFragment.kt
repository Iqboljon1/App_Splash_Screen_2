package com.ir.appsplashscreen2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.ir.appsplashscreen2.databinding.FragmentSplahBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 = "param4"

class SplahFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null
    private var param4: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getString(ARG_PARAM3)
            param4 = it.getString(ARG_PARAM4)
        }
    }

    lateinit var binding: FragmentSplahBinding

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSplahBinding.inflate(layoutInflater)
        binding.tvName.text = param1
        binding.tvDescription.text = param2
        binding.imageSplash.setImageResource(param3!!.toInt())

        binding.tvSkip.setOnClickListener {
            findNavController().navigate(R.id.action_boardingFragment_to_homeFragment)
        }

        val viewPager = requireActivity().findViewById<ViewPager2>(R.id.viewPager)
        when (param4!!.toInt()) {
            0 -> {
                binding.imageArrowRight.setOnClickListener {
                    viewPager.currentItem = 1
                }
                binding.tvKeyingisi.setOnClickListener {
                    viewPager.currentItem = 1
                }
            }
            1 -> {
                binding.imageArrowRight.setOnClickListener {
                    viewPager.currentItem = 2
                }
                binding.tvKeyingisi.setOnClickListener {
                    viewPager.currentItem = 2
                }
            }
            2 -> {
                binding.imageArrowRight.setOnClickListener {
                    viewPager.currentItem = 3
                }
                binding.tvKeyingisi.setOnClickListener {
                    viewPager.currentItem = 3
                }
            }
            3 -> {
                binding.tvKeyingisi.text = "Tugatish"

                binding.imageArrowRight.setOnClickListener {
                    findNavController().navigate(R.id.action_boardingFragment_to_homeFragment)
                }

                binding.tvKeyingisi.setOnClickListener {
                    findNavController().navigate(R.id.action_boardingFragment_to_homeFragment)
                }
            }
        }
        return binding.root
    }

    companion object {

        fun newInstance(param1: String, param2: String, param3: String, param4: String) =
            SplahFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    putString(ARG_PARAM3, param3)
                    putString(ARG_PARAM4, param4)
                }
            }
    }
}