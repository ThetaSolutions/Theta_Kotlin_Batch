package com.salmannazir.testfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_life_cylce.*

class LifeCycleActivity : AppCompatActivity() {

//    var mSubmitButton: Button? = null
//    var mEtUserName: EditText? = null
//    var mEtPassword: EditText? = null

    //1-  Activity LifeCycle First Method.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cylce)

        // Conventional way for java.....
//        mEtPassword = findViewById(R.id.etPassword)
//        mEtUserName = findViewById(R.id.etUserName)
//        mSubmitButton = findViewById(R.id.btnSubmit)

        showToast("OnCreate")
        Log.d("MyActivity", "onCreate")

        btnSubmit.setOnClickListener {
            goToNextActivity()
        }
        //  mSubmitButton.setOnClickListener()
        // EditeText Value get

    }

    private fun goToNextActivity() {
        val mainIntent = Intent(baseContext, MainActivity::class.java)
        mainIntent.putExtra("userName", etUserName.text.toString())
        mainIntent.putExtra("age", etUserName.text.toString())
        mainIntent.putExtra("userName", etUserName.text.toString())
        mainIntent.putExtra("userName", etUserName.text.toString())
       // mainIntent.putExtra("phone", etUserName.text)
        startActivity(mainIntent)
    }


    //2-  Screen will be displayed here
    // user can't interact with app
    override fun onStart() {
        super.onStart()
        showToast("onStart")
        Log.d("MyActivity", "onStart")
    }

    //3- method > Receive interation.
    override fun onResume() {
        super.onResume()
        showToast("OnResume")
        Log.d("MyActivity", "onResume")
        // start the video > FACEBOOK
        // start the audio song > Soundcloud
        // start the recording.
    }

    // 4th Function....
    // no more interation
    override fun onPause() {
        super.onPause()
        showToast("onPause")
        Log.d("MyActivity", "onPause")
        // if video is playing, Pause the video/audio
        // if recoding, stop it.
        //...... if speaker ....


    }


    // activity will not be shown anymore on the screen
    override fun onStop() {
        super.onStop()
        showToast("onStop")
        Log.d("MyActivity", "onStop")

    }


    override fun onRestart() {
        super.onRestart()
        showToast("onRestart")
        Log.d("MyActivity", "onRestart")

    }


    // Corrospond to OnCreate
    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy")
        Log.d("MyActivity", "onDestroy")

    }


    private fun showToast(text: String) {
        // Toast code here
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}
