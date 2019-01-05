package com.salmannazir.testfirstapplication;

import java.io.Serializable;

public class Student implements Serializable {

    private String firstName;
    private String lastName;
    private int age;
    private int mobile;
    private String gender;
    private String subject;
    private String profilePhoto;

    public Student(String firstName, String lastName, int age,
                   int mobile, String gender, String subject,
                   String profilePhoto) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobile = mobile;
        this.gender = gender;
        this.subject = subject;
        this.profilePhoto = profilePhoto;
    }
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
