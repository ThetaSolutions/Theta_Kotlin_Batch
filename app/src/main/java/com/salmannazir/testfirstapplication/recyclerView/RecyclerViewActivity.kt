package com.salmannazir.testfirstapplication.recyclerView

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.salmannazir.testfirstapplication.R
import com.salmannazir.testfirstapplication.Student
import kotlinx.android.synthetic.main.activity_recycler_view.*
import android.content.DialogInterface
import android.support.v7.app.AlertDialog



class RecyclerViewActivity : AppCompatActivity(), OnItemClick {



    var mRecyclerView: RecyclerView? = null
    var studentAdapter: StudentAdapter? = null
    var studentList: ArrayList<Student>? = null


    override fun onClick(position: Int, itemView: View) {

//        Toast.makeText(this, itemView.first_name.text, Toast.LENGTH_SHORT).show()
//        // Int
        val student: Student? = studentList?.get(position)
//        val intent = Intent(this, MainActivity::class.java)
//        intent.putExtra("studentObject", student)
//        startActivity(intent)

        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("Student Detail")
        alertDialog.setMessage("Student Name :" +  student?.firstName)
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
            DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
        alertDialog.show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        mRecyclerView = recyclerView

     //   val mLayoutManager = GridLayoutManager(this, 2)
        val mLayoutManager = LinearLayoutManager(this)

        studentAdapter = StudentAdapter(this, this)
        studentList = getStudents()
        studentAdapter?.addStudents(studentList!!)

        mRecyclerView?.layoutManager = mLayoutManager
        mRecyclerView?.adapter = studentAdapter

    }

    private fun getStudents(): ArrayList<Student> {
        val studentList = arrayListOf<Student>()
        studentList.add(Student("salman", "Nazir", 27))
        studentList.add(Student("abc", "xyz", 20))
        studentList.add(Student("adf", "ewr", 21))
        studentList.add(Student("dsagqrw", "grg", 23))
        studentList.add(Student("agadg", "fads", 29))
        studentList.add(Student("salman", "Nazir", 27))
        studentList.add(Student("abc", "xyz", 20))
        studentList.add(Student("adf", "ewr", 21))
        studentList.add(Student("dsagqrw", "grg", 23))
        studentList.add(Student("agadg", "fads", 29))

        return studentList
    }
}
