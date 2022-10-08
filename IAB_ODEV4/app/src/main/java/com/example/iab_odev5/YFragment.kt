package com.example.iab_odev5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.iab_odev5.databinding.FragmentYBinding


class YFragment : Fragment() {

    private lateinit var tasarim:FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = FragmentYBinding.inflate(inflater, container, false)

        

        return tasarim.root
    }
    override fun onResume() {
        super.onResume()

    }

}