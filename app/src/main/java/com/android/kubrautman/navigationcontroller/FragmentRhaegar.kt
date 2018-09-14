package com.android.kubrautman.navigationcontroller

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.android.kubrautman.navigationcontroller.R.id.button2
import kotlinx.android.synthetic.main.lynna_fragment.*
import kotlinx.android.synthetic.main.rhaegar_fragment.*


class FragmentRhaegar : Fragment() {
    // TODO: Rename and change types of parameters




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.rhaegar_fragment, container, false)

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button2.setOnClickListener { Navigation.findNavController(it).navigate(R.id.fragmentJonSnow) }
    }


}

