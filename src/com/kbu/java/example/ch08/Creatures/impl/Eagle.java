package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.AbstarctBird;

public class Eagle extends AbstarctBird {

    public Eagle() {
        super("Eagle");
    }

    @Override
    public void sound() {
        System.out.println(this.getAnimalName() + " : kkiii!!");
    }
}
