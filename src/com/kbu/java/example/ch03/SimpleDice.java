package com.kbu.java.example.ch03;
/*
 * File name SimpleDice.java
 */


public class SimpleDice {
    public static void main(String[] args){
        double rand = Math.random();
        int diceValue = ((int)(rand * 1000) % 6) + 1;

        System.out.println(diceValue);
    }
}