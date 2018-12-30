package com.salmannazir.testfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_class.*

class IntentClassActivity : AppCompatActivity() {

    lateinit var testStudent: StudentInKotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_class)

        explicitIntentButton.setOnClickListener {
            explicitIntent()
        }

        implicitIntentButton.setOnClickListener {
            implicitIntent()
        }
    }

    private fun implicitIntent() {
    val intent = Intent()
    intent.action = Intent.ACTION_SEND
    intent.type = "text/plain"
//    intent.type = "application/pdf"
//    intent.type = "image/jpg"
//    intent.type = "video/mp4"
//    intent.type = "video/*"
//    intent.type = "audio/mp3"
//    intent.type = "*/*"
    intent.putExtra(Intent.EXTRA_TEXT, "This is Theta Solutions")
    startActivity(Intent.createChooser(intent,"Send TO"))
}

    private fun explicitIntent() {
        // Explicit Intent
        testStudent.firstName = "Theta"
        testStudent.lastName = "Solution"
        testStudent.age = 5
        testStudent.mobile = 98789789

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("studentObject", testStudent)
        startActivity(intent)
    }
}
