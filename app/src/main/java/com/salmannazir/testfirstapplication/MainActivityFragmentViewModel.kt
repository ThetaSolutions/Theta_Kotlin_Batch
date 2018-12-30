package com.salmannazir.testfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.salmannazir.testfirstapplication.ui.mainactivityfragmentviewmodel.MainActivityFragmentViewModelFragment

class MainActivityFragmentViewModel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_fragment_view_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainActivityFragmentViewModelFragment.newInstance())
                .commitNow()
        }
    }

}
