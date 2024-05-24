package com.kbu.java.example.ch08.Creatures.Applications;

import com.kbu.java.example.ch08.Creatures.*;
import com.kbu.java.example.ch08.Creatures.Util.*;
import com.kbu.java.example.ch08.Creatures.impl.*;

public class AbstractDemo {

    public static void allAction(IAnimal ... animals){
        for(IAnimal animal : animals){
            if( animal instanceof Swimmable){
                System.out.println("swim result--------");
                ((Swimmable)animal).swim();
            }
            if(animal instanceof Flyable) {

                System.out.println("fly result--------");
                ((Flyable)animal).Fly();
            }
            if (animal instanceof Talkable){
                System.out.println("Talk result--------");
                ((Talkable)animal).talkWith(animals);
            }
        }
    }

    public static void main(String[] args){
        // Animal human = new Human();
        // Animal bat = new Bat();
        // Animal eagle = new Eagle();
        // Animal penguin = new Penguin();
        IAnimal human = CreatureFactory.makeCreature("human");
        IAnimal bat = CreatureFactory.makeCreature("bat");
        IAnimal eagle = CreatureFactory.makeCreature("eagle");
        IAnimal penguin = CreatureFactory.makeCreature("penguin");

        // human.sound();
        // bat.sound();
        // eagle.sound();
        // penguin.sound();

        allAction(human, bat, eagle, penguin);
    }
}
