package com.example.memorygame.view.dest

import android.view.animation.LinearInterpolator

import com.example.memorygame.R
import com.example.memorygame.databinding.FragmentMainBinding
import com.example.memorygame.view.activity.MainActivity
import com.example.memorygame.view.adapter.Adapter
import com.example.memorygame.view.contents.Contents
import com.example.memorygame.view.viewbase.FragmentBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainFragment : FragmentBase<FragmentMainBinding>(R.layout.fragment_main) {

    private val dp by lazy { resources.displayMetrics.density }

    override fun FragmentMainBinding.setOnCreateViewEvent() {
        setAdapter()
        setGameFlow()

    }


    private fun setAdapter() {
        binding.recyclerView.adapter = context?.let {
            Adapter(
                it,
                Contents.GAME_READY_MODE
            )
        }
    }

    private fun setGameFlow() {

        binding.apply {
            fun timeBarAnimation(layoutWidth: Int) {

                viewTimeBar.animate().apply{
                    translationX(-layoutWidth / 1.92F * dp)
                    interpolator = LinearInterpolator()
                    duration =
                        Contents.GAME_ROUND_TIME
                }.start()
            }


            CoroutineScope(Dispatchers.Main).launch {
                delay(3000)
                textViewInfo.text = R.string.tv_remember.toString()
                timeBarAnimation(MainActivity.displayWidth)
                (recyclerView.adapter as Adapter).run {

//            (Math.random() * 8)
                    notifyDataSetChanged()
                }
            }
        }

    }
}