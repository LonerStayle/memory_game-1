package com.example.memorygame.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.memorygame.R
import com.example.memorygame.databinding.ViewholderBinding
import com.example.memorygame.view.contents.Contents

class Adapter(var context: Context, var gameSettingPosition: Int) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = DataBindingUtil.bind<ViewholderBinding>(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.viewholder, parent, false))

    override fun getItemCount(): Int = 9

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (gameSettingPosition == Contents.GAME_START_MODE)
            holder.itemView.setOnClickListener {}


    }
}