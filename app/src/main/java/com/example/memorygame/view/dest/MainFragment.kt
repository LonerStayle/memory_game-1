package com.example.memorygame.view.dest

import android.view.animation.AnimationUtils
import com.example.memorygame.R
import com.example.memorygame.view.viewbase.BaseFragment
import com.example.memorygame.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {

    private val bounceAnim by lazy {
        AnimationUtils.loadAnimation(requireContext(), R.anim.bounce_with_rotate)
    }

    override fun FragmentMainBinding.bindingViewData() {
        imageViewAppIcon.startAnimation(bounceAnim)
    }

    override fun FragmentMainBinding.setEventListener() {

    }

}