package com.kbu.java.example.ch11.EnumSample;

import com.kbu.java.example.ch11.EnumSample.Constants.*;

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.TUESDAY;

        switch (today) {
            case MONDAY -> System.out.println("It's Monday. Start of the work week.");
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("It's a midweek day.");
            case FRIDAY -> System.out.println("It's Friday. End of the work week.");
            case SATURDAY, SUNDAY -> System.out.println("It's the weekend. Enjoy!");
            default -> System.out.println("Unexpected value: " + today);
        }
    }
}

