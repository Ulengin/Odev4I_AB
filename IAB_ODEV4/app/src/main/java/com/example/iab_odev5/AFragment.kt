package com.example.iab_odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.iab_odev5.databinding.FragmentABinding


class AFragment : Fragment() {
    private lateinit var tasarim:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = FragmentABinding.inflate(inflater, container, false)

        tasarim.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.BFragment)
        }

        return tasarim.root
    }

}