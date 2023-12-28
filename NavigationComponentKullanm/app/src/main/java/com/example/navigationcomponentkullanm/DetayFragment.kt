package com.example.navigationcomponentkullanm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanm.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar
        val gelenUrunler = bundle.Urun
        val evliMi : String
         if (gelenBekar){
             evliMi = "Evli"
         }
        else
         {
             evliMi = "Değil"
         }
        binding.textView2.text = "$gelenAd -$evliMi - $gelenYas - $gelenBoy - ${gelenUrunler.id } - ${gelenUrunler.ad} "

        val backpress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textView2 ,"Geri Dönmek istiyor musnuz ?" , Snackbar.LENGTH_SHORT).setAction("Evet")
                {
                    isEnabled = false
                    requireActivity().onBackPressedDispatcher.onBackPressed()
                }.show()
            }

        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backpress)


        return binding.root
    }


}