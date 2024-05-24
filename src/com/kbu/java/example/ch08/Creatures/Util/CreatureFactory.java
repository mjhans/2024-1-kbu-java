package com.kbu.java.example.ch08.Creatures.Util;

import com.kbu.java.example.ch08.Creatures.*;
import com.kbu.java.example.ch08.Creatures.impl.*;

public class CreatureFactory {
    public static IAnimal makeCreature(String creatureType){

        IAnimal animal = switch(creatureType.toLowerCase()) {
            case "human" -> new Human();
            case "bat" -> new Bat();
            case "penguin" -> new Penguin();
            case "eagle" -> new SuperEagle();
            default -> null;
        };
        return animal;


    }
}
