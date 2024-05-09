package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Eagle extends AbstarctBird implements Flyable{

    @Override
    public void sound() {
        System.out.println("kkiii!!");
    }

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
