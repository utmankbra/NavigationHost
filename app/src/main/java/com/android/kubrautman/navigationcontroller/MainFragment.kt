package com.android.kubrautman.navigationcontroller

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*




class MainFragment : Fragment() {

    private  lateinit var viewModel: ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

  starkButton.setOnClickListener {
 Navigation.findNavController(it).navigate(R.id.fragmentLynna) }

        targaryenButton.setOnClickListener { Navigation.findNavController(it).navigate(R.id.fragmentRhaegar) }
}


    }






