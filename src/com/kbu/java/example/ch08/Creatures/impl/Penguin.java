package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.AbstarctBird;
import com.kbu.java.example.ch08.Creatures.Swimmable;


public class Penguin extends AbstarctBird implements Swimmable{
    public Penguin(){
        super("Penguin");
    }

    @Override
    public void sound() {
        System.out.println(this.getAnimalName() + " : sound");
    }
    public void Fly(){
        System.out.println(this.getAnimalName() + " cannot fly");
    }

    public void swim(){
        System.out.println(this.getAnimalName() + " can swim");
    }
    
}
