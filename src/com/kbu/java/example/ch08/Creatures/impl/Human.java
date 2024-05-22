package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Human extends AbstractMammal {
    public Human(){
        super("Human");
    }

    public void sound(){
        System.out.println(this.getAnimalName() + " : AAAAAAAhhhh");
    }
}
