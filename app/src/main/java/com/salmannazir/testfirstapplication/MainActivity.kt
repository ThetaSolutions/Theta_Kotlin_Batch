package com.salmannazir.testfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.salmannazir.testfirstapplication.test.GithubApiService
import com.salmannazir.testfirstapplication.test.Post
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val userName: String = intent.getStringExtra("userName")
//
//       var mObject:StudentInKotlin= intent.getSerializableExtra("") as StudentInKotlin
//        hello2.text = userName
        hello2.setText("Main Activity")
        Toast.makeText(this, "", Toast.LENGTH_LONG).show()

        getComments()
    }

    private fun abc() {
        var service = GithubApiService.Factory.create()
        var call = service.posts}


    private fun getComments() {
        var service = GithubApiService.Factory.create()
        var call = service.posts

        call.enqueue(object : Callback<List<Post>> {
          override  fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {

                if (!response.isSuccessful()) {
                    return
                }

                val posts = response.body()
              if (posts!=null){
                  for (comment in posts) {
                      var content = ""
                      content += "Post ID: " + comment.id + "\n"
                      content += "Name: " + comment.title + "\n"
                  }
              }


            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                hello2.setText("Main Activity")

            }
        })
    }
}



