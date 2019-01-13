package com.salmannazir.testfirstapplication.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.salmannazir.testfirstapplication.R
import kotlinx.android.synthetic.main.fragment_setting_list.view.*

class SettingListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_setting_list, container, false)
        view.idTestNewFragment.setOnClickListener {
            Toast.makeText(activity, "", Toast.LENGTH_LONG).show()
            if (activity is FragmentActivity){
                (activity as FragmentActivity).loadSettingDetailFragment()

            }
        }
        return view
    }


}
