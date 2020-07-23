package com.example.memorygame.view.activity

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.memorygame.R
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    companion object {
       var displayWidth by Delegates.notNull<Int>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display = windowManager.defaultDisplay
        val size = Point()
        display.getRealSize(size)
        displayWidth = size.x

    }
}
