package com.kbu.java.example.ch07;

import java.util.Random;

class Dice{
    public int MAX_VALUE = 6;
    public int MIN_VALUE = 1;

    public int faceValue = 0;

    public void roll(){
        Random rnd = new Random();
        faceValue = rnd.nextInt(100) % 6 + 1;
    }
}

class DiceDemo{
    public static void main(String[] args){
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        d1.roll();
        d2.roll();
        System.out.printf("two dice : %d \n", d1.faceValue + d2.faceValue);
    }
}