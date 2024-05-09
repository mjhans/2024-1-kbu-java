package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Bat extends AbstractMammal implements Flyable{
    public void sound() {
        System.out.println("BBiBBi!!");
    }

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
