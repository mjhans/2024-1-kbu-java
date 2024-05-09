package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Penguin extends AbstarctBird implements Swimmable{

    @Override
    public void sound() {
        System.out.println("Penguin sound");
    }

    @Override
    public void swim() {
        System.out.println("i can swim");
    }
    
}
