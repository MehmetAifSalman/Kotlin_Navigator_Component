package com.example.navigationcomponentkullanm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentkullanm.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar


open class BottomSheetFragment : BottomSheetDialogFragment() {

        private lateinit var binding: FragmentBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.viewKopyala.setOnClickListener {
            Snackbar.make(it , "Kopyalandı" , Snackbar.LENGTH_SHORT).show()
        }
        binding.viewYapRtR.setOnClickListener {
            Snackbar.make(it , "Paylaşıldı" , Snackbar.LENGTH_SHORT).show()
        }







        return binding.root
    }


}