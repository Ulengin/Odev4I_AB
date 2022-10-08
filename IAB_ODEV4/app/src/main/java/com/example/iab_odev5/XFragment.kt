package com.example.iab_odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.iab_odev5.databinding.FragmentXBinding


class XFragment : Fragment() {
    private lateinit var tasarim : FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = FragmentXBinding.inflate(inflater, container, false)

        tasarim.buttonXY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.YFragment)

        }

        return tasarim.root
    }

}