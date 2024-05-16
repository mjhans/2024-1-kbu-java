package com.kbu.java.example.Homework.SimpleStudent;

public class Address {
    String streetAddress;
    String city;
    String state;
    long zipCode;

    Address(String streetAddress, String city, String state){
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    String addressString(){
        return String.format("%s, %s, %s",this.city, this.state, this.streetAddress);
    }
}
