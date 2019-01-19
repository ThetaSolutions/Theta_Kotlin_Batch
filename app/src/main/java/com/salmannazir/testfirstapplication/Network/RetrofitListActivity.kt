package com.salmannazir.testfirstapplication.Network

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.salmannazir.testfirstapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_list)

       // getPost()
        getComments()
    }

    private fun getComments() {
        var service = ThetaService.Factory.create()
        var postCall = service.comments

        postCall.enqueue(object :Callback<List<Comment>>{
            override fun onFailure(call: Call<List<Comment>>, t: Throwable) {
                // SHow the error
            }

            override fun onResponse(call: Call<List<Comment>>, response: Response<List<Comment>>) {

                if (!response.isSuccessful){
                    //Message Show
                    return
                }
                // There must be Post list now.
                var commentList = response.body()

                if(commentList!=null) {

                    for (comment in commentList){
                        Log.d("Email", comment.email)
                        Log.d("Name", comment.name)
                        Log.d("Body", comment.body)
                    }
                    //Adapter.addComments(coomentList)
                }


            }

        })
    }

    private fun getPost() {

        var service = ThetaService.Factory.create()
        var postCall = service.post

        postCall.enqueue(object :Callback<List<Post>>{
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                // SHow the error
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {

                if (!response.isSuccessful){
                    //Message Show
                    return
                }
                // There must be Post list now.
                var postList = response.body()

                if(postList!=null) {

                     for (post in postList){
                         Log.d("ID", post.userId.toString())
                         Log.d("Body", post.body)
                         Log.d("Title", post.title)
                     }
                         //Adapter.addPosts(postList)
                }


            }

        })
    }
}
