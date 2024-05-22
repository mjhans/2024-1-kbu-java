package com.kbu.java.example.ch08.Creatures.Applications;

import com.kbu.java.example.ch08.Creatures.AbstractAnimal;
import com.kbu.java.example.ch08.Creatures.impl.*;;

public class AbstractDemo {
    public static void main(String[] args){
        AbstractAnimal human = new Human();
        AbstractAnimal bat = new Bat();
        AbstractAnimal eagle = new Eagle();
        AbstractAnimal penguin = new Penguin();

        human.sound();
        bat.sound();
        eagle.sound();
        penguin.sound();
    }
}
