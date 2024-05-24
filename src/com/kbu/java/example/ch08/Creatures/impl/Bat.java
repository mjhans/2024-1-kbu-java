package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Bat extends AbstractMammal implements Flyable{
    
    public Bat(){
        super("Bat");
    }

    public void sound() {
        System.out.println( this.getAnimalName() + " : !!!!!!!BBiBBi!!");
    }

    @Override
    public void Fly() {
        System.out.println(this.getAnimalName() + " can fly, 더 멀리");
    }
    
}
