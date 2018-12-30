package com.salmannazir.testfirstapplication.recyclerView

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.LayoutManager
import com.salmannazir.testfirstapplication.R
import com.salmannazir.testfirstapplication.Student
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    var mRecyclerView: RecyclerView? = null
    var studentAdapter: StudentAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        mRecyclerView = recyclerView

        val mLayoutManager = LinearLayoutManager(this)

        studentAdapter = StudentAdapter()
        studentAdapter?.addStudents(getStudents())

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
