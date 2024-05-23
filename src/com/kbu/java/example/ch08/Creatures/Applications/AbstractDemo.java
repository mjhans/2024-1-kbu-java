package com.kbu.java.example.ch08.Creatures.Applications;

import com.kbu.java.example.ch08.Creatures.Animal;
import com.kbu.java.example.ch08.Creatures.impl.*;;

public class AbstractDemo {
    public static void main(String[] args){
        Animal human = new Human();
        Animal bat = new Bat();
        Animal eagle = new Eagle();
        Animal penguin = new Penguin();

        human.sound();
        bat.sound();
        eagle.sound();
        penguin.sound();
    }
}
