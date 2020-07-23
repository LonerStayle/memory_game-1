package com.example.memorygame.view.viewbase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

open class FragmentBase<B : ViewDataBinding>(@LayoutRes private val layoutRes: Int) : Fragment() {

    protected lateinit var binding: B

    open fun B.setOnCreateViewEvent() = Unit


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = DataBindingUtil.inflate<B>(inflater, layoutRes, container, false).run {

        binding = this

        setOnCreateViewEvent()

        root
    }
}