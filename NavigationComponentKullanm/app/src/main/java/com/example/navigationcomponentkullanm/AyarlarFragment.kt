package com.example.navigationcomponentkullanm

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentkullanm.databinding.FragmentAyarlarBinding
import kotlin.jvm.internal.Intrinsics.Kotlin


class AyarlarFragment : Fragment() {

    private lateinit var binding: FragmentAyarlarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAyarlarBinding.inflate(inflater, container, false)
        binding.AyarText1.text = "değişti"


        return binding.root
    }

}