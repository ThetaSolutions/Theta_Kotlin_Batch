package com.salmannazir.testfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        kotlinVariable()
        concatination()
        valDiffVar()
        dataTypes()
        convertDataType()
        MathOperators()
        incrementDecrement()
        relationalOperaters()
        nullSafety()?.let() {}
        logicalOperators()
        logicalStatement()
        whenStatement()

        loopWIthRange()

    }

    private fun loopWIthRange() {
        // ArrayList
        var studentList = arrayListOf<String>()
        studentList.add("Salman")
        studentList.add("Hamza")
        studentList.add("Abc")
        studentList.add("Mudassar")

        Log.d("Student List Size", studentList.size.toString())

        studentList.forEach {
            Log.d("Student Name", it)
        }

        //Contains
        if(studentList.contains("Salman")){

        }


        //List

        val list = List<Int>(5) {1}
        for (test in list){
            Log.d("For Loop in Array",
                test.toString())
        }

        // with Range
        for (test in 1000..10){
            Log.d("For Loop in Array",
                test.toString())
        }
    }

    private fun whenStatement() {
        val a = 5

        when(a) {
            1 -> {
                // Do something in case of 1
            }
            2,3,4 -> { //Range with When

            }
            else ->{

            }
        }
    }

    private fun logicalStatement() {
        val a= 5
        val b = 10

        if(a > b){
            //Do Something
        }else if (b<a){
            //Do Something
        } else{
            //Do Something
        }
    }

    private fun logicalOperators() {
        // AND: &&
        // OR: ||
        // Not: !

    }

    private fun nullSafety(): String {
        //Decrlation
        var a: String? = null

        var v: Button? = null

        //  v.text // Null Pointer Exception bcz button is null
        //  val buttonTextNotSafe =  v.text.toString()
        val buttonText = v?.text.toString()
        //=

//        if(v!=null) {
//            v.text
//        }

        Log.d("MyTag", a)


        // Let function
        v?.text.toString().let {

            Log.d("NullSafety with Let", it)
        }

        return ""
    }

    private fun relationalOperaters() {
        val a = 30
        val b = 40

        if (a < b) {

        }
        if (a > b) {

        }
        if (a == b) {

        }
        if (a != b) {

        }

    }

    private fun incrementDecrement() {
        var a = 5
        var b = 6
        var c = a++ + b // 13 by females
        //   var d = a---b // -1,
        //  var zz = a- --b // 0,
        //  var yy = a-- -b // -1
        //  var e = ++a+b // 12
        //   var f = a+b++


        Log.d("Incremented", "" + c) // 12, 13,
        //    Log.d("decremented" ,""+ a---b ) //
    }

    private fun MathOperators() {
        val a = 6
        val b = 7

        var sum = a + b
        var min = a - b
        var mul = a * b
        var div = a / b

    }

    private fun convertDataType() {
        var a: String = "5"  //String
        val b = 5  //Int

        var converted = a.toInt()   // integer type.


        //  Log.d("Converted Value of b", b.toString())  //For custom object
        Log.d("Converted Value of a", "" + a.toInt())
    }

    private fun dataTypes() {
        var a: Int = 6
        var a1: Int = -6
        var b: String = "Theta"
        var d: Boolean = true

        var c: Double = 6.6
        var e: Float = 6.6F // Add F must for float

    }

    private fun valDiffVar() {
        // Val -> Value
        // Var -> Variable

        var age = 24
        val dateOB = "12/12/2000" //never be able to change.

        //  dateOB = "13/11/2000" // Not Possible
        age = 25    //Possible
    }

    private fun concatination() {
        val a = 5
        val b = 10

        Log.d(
            "KotlinActivity",
            "A is" + a + " And B is" + b
        )

        Log.d(
            "KotlinActivity",
            "A is$a And B is$b"
        )  // By Automatic generation of template

        Log.d(
            "KotlinActivity",
            "A is $a And B is $b"
        ) // Self coded
    }

    private fun kotlinVariable() {

        var c: String? = "Kotlin" // ? -> null check
        c = null    //Possible

        var a = 5 // Automatic DataType
        //a = "Theta" // Not Possible
        // a = null // not Possible

        var b: String = "Theta"  //Explicit DataType
        // b = null // Not Possible
        b = "" // Possible because it has empty string

    }



    // Class in Kotlin


}
