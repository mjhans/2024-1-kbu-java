package com.kbu.java.example.ch08.Creatures.impl;

import com.kbu.java.example.ch08.Creatures.*;

public class Human extends AbstractMammal implements Swimmable, Talkable {
    public Human(){
        super("Human");
    }

    public void sound(){
        System.out.println(this.getAnimalName() + " : AAAAAAAhhhh");
    }

    @Override
    public void swim() {
        System.out.println(this.getAnimalName() + " can swim");
    }

    @Override
    public void talkWith(IAnimal... all) {
        System.out.println(all);
        for(IAnimal animal : all){
            animal.sound();
        }
    }
    
}
