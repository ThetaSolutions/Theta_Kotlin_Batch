package com.salmannazir.testfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val userName: String = intent.getStringExtra("userName")
//
//       var mObject:StudentInKotlin= intent.getSerializableExtra("") as StudentInKotlin
//        hello2.text = userName
        hello2.setText("Main Activity")


    }
}



