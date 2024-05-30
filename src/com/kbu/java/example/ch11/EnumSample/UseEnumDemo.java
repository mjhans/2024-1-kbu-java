package com.kbu.java.example.ch11.EnumSample;

import com.kbu.java.example.ch11.EnumSample.Constants.Day;

public class UseEnumDemo {
    public static void main(String[] args){
        for (Day dt : Day.values()){
            System.out.println(dt.toString());
        }

        Day monday = Day.valueOf("MONDAY");

        System.out.println(monday.toString());

    }
}
