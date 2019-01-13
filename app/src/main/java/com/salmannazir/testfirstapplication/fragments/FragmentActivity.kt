package com.salmannazir.testfirstapplication.fragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.salmannazir.testfirstapplication.R
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        buttonLoad.setOnClickListener {
            loadSettingListFragment()

        }

    }

    public fun loadSettingDetailFragment() {

        //1- Get the Fragment instance
        val fragment = SettingDetailsFragment()

        //2- get Fragment Support manager Instance
        val manager = supportFragmentManager

        //3- Begin fragment transaction using manager
        val transaction = manager.beginTransaction()

        //-4 Add the specific fragment in specific Container
        transaction.add(R.id.container, fragment)
        transaction.addToBackStack(null)

        //5 Finishing the transactions
        transaction.commit()
    }

    private fun loadSettingListFragment() {

        //1- Get the Fragment instance
        val fragment = SettingListFragment()

        //2- get Fragment Support manager Instance
        val manager = supportFragmentManager

        //3- Begin fragment transaction using manager
        val transaction = manager.beginTransaction()

        //-4 Add the specific fragment in specific Container
        transaction.add(R.id.container, fragment)
        transaction.addToBackStack(null)

        //5 Finishing the transactions
        transaction.commit()



    }
}
