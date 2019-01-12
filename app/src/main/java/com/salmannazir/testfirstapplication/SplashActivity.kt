package com.salmannazir.testfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private var SPLASH_DELAY: Long = 3000 // 3 Seconds
    private var mDelayHandler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // initialize the Handler
        mDelayHandler = Handler()

        //Go To Next Activity With Specific Delay
        mDelayHandler?.postDelayed(mRunnable, SPLASH_DELAY)
    }

    internal val mRunnable: Runnable = Runnable {

        // Intent
        val intent = Intent(this, NavigationDrawerActivity::class.java)
        startActivity(intent)
        finish()
        //       mainLayout.setBackgroundColor(resources.getColor(R.color.whiteCol))
        //      mainLayout.background = ContextCompat.getDrawable(this, R.drawable.ic_transfer)

        //     bgLayout.visibility = View.GONE
        //    splashImage.visibility = View.VISIBLE
    }
}
