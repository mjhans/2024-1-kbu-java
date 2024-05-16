package com.kbu.java.example.Homework.SimpleStudent;

public class Student {
    String name;
    Address homeAddress;
    Address schoolAddress;

    Student(String name, Address homeAddress, Address schoolAddress){
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.name = name;
    }

    String getStudentInfo(){
        return String.format("Student Name: %s, \n\thomeAddress: %s, \n\tschoolAddress: %s", this.name, this.homeAddress.addressString(), this.schoolAddress.addressString());
    }
}
