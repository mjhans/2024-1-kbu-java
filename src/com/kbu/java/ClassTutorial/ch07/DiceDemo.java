package com.kbu.java.ClassTutorial.ch07;

import java.util.Random;

class Dice{
    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 6;

    private int faceValue = 0;

    public int roll(){
        Random rand = new Random();
        
        faceValue = (rand.nextInt(1000) % MAX_VALUE) + 1;
        return faceValue;
    }
    public int getFaceValue(){
        return faceValue;
    }
}

class DiceDemo{
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
    
        //System.out.println(dice1.MAX_VALUE + ", " + dice1.MIN_VALUE);
        //System.out.println(dice2.MAX_VALUE + ", " + dice2.MIN_VALUE);
        int val = dice1.roll();
        //dice2.roll();

        System.out.println(val);
        System.out.println(dice1.getFaceValue());       

    }
}