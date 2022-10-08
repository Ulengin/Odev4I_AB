package com.example.iab_odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.iab_odev5.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.buttonA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.AFragment)
        }
        tasarim.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.XFragment)
        }

        return tasarim.root
    }

}