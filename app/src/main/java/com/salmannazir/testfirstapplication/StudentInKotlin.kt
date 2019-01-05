package com.salmannazir.testfirstapplication

import java.io.Serializable

class StudentInKotlin(var firstName: String, var lastName: String, var age: Int, var mobile: Int,
    var gender: String,
    var subject: String,
    var profilePhoto: String
) : Serializable
