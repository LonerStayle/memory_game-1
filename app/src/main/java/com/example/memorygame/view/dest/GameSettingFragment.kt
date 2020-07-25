package com.example.memorygame.view.dest

import androidx.navigation.fragment.findNavController
import com.example.memorygame.R
import com.example.memorygame.view.viewbase.BaseFragment
import com.example.memorygame.databinding.FragmentGameSettingBinding


class GameSettingFragment :
    BaseFragment<FragmentGameSettingBinding>(R.layout.fragment_game_setting) {


    override fun FragmentGameSettingBinding.bindingViewData() {
        buttonGameStart.setOnClickListener {
            val round = numberpickerRound.value
            val col = numberpickerCol.value
            val row = numberpickerRow.value

            findNavController().navigate(GameSettingFragmentDirections.actionGameSettingFragmentToGameFragment(round,row,col))
        }
    }

    override fun FragmentGameSettingBinding.setEventListener() {

    }
}