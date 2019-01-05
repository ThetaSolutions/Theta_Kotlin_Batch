package com.salmannazir.testfirstapplication.recyclerView

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.salmannazir.testfirstapplication.MainActivity
import com.salmannazir.testfirstapplication.R
import com.salmannazir.testfirstapplication.Student
import kotlinx.android.synthetic.main.recycler_view_single_item.view.*


class StudentAdapter( var onClick: OnItemClick, var context: Activity) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {


    var studentList = arrayListOf<Student>()
   // var context: Context? = null   Method 1
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int)
            : StudentViewHolder {

        val studentViewHolder: StudentViewHolder
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_single_item, parent, false)
        studentViewHolder = StudentViewHolder(view)
        // context = parent.context  Method 1
        return studentViewHolder
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(viewHolder: StudentViewHolder, position: Int) {
        val firstName: TextView = viewHolder.itemView.first_name
        val lastName: TextView = viewHolder.itemView.last_name
        val age: TextView = viewHolder.itemView.age


        val student: Student
        student = studentList.get(position)

        firstName.text = student.firstName
        lastName.text = student.lastName
        age.text = student.age.toString()

        viewHolder.itemView.setOnClickListener {
            onClick.onClick(position, viewHolder.itemView)
//            Toast.makeText(context, student.firstName, Toast.LENGTH_SHORT).show()
//            // Int
//            if (context is RecyclerViewActivity) {
//                val intent = Intent(context, MainActivity::class.java)
//                intent.putExtra("studentObject", student)
//                context.startActivity(intent)
//            }

         // Difference between *is* and *as* in Kotlin
        }

    }

    public fun addStudents(studentsList: ArrayList<Student>) {
        this.studentList = studentsList

    }


    class StudentViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    }
}