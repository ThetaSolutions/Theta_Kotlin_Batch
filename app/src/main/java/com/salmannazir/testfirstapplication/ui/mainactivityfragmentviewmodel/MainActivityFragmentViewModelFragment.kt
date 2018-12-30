package com.salmannazir.testfirstapplication.ui.mainactivityfragmentviewmodel

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.salmannazir.testfirstapplication.R

class MainActivityFragmentViewModelFragment : Fragment() {

    companion object {
        fun newInstance() = MainActivityFragmentViewModelFragment()
    }

    private lateinit var viewModel: MainActivityFragmentViewModelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_activity_fragment_view_model_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainActivityFragmentViewModelViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
