package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Bat extends AbstractMammal {
    
    public Bat(){
        super("Bat");
    }

    public void sound() {
        System.out.println( this.getAnimalName() + " : BBiBBi!!");
    }
}
