package com.salmannazir.testfirstapplication

import java.io.Serializable

class StudentInKotlin(
    firstName: String,
    lastName: String,
    var age: Int,
    var mobile: Int,
    gender: String,
    subject: String,
    profilePhoto: String
) :Serializable {

    var firstName: String? = firstName
    var lastName: String? = lastName
    var gender: String? = gender
    var subject: String? = subject
    var profilePhoto: String? = profilePhoto
}
