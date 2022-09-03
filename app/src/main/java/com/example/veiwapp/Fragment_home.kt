package com.example.veiwapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView

class Fragment_home : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_home, container, false)

        var Maths = view.findViewById<CardView>(R.id.Maths)
        Maths.setOnClickListener{
            val c = Intent(this@Fragment_home.requireContext(),MainActivity2::class.java)
            startActivity(c)
        }


        return view
    }



}

