package com.example.navigationcomponentkullanm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanm.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {
            //Snackbar.make(it , "Merhaba" , Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "nasılsın ?"
            val urun = Urunler(124587 , "Detay_1")
            val gecis = AnasayfaFragmentDirections.detaygecis(Urun = urun, ad = "Ahmet" , yas = 54 , boy = 1.78f , bekar = true)
            Navigation.findNavController(it).navigate(gecis)
        }
        binding.MenuGoster.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)
        }


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onPause() {
        super.onPause()
    }



    override fun onResume() {
        super.onResume()
    }

}