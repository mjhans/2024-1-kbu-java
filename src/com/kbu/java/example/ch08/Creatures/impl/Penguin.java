package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.AbstarctBird;


public class Penguin extends AbstarctBird {
    public Penguin(){
        super("Penguin");
    }

    @Override
    public void sound() {
        System.out.println(this.getAnimalName() + " : sound");
    }
    
}
