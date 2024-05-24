package com.kbu.java.example.ch08.SimpleInterface;

import com.kbu.java.example.ch08.Creatures.IAnimal;
import com.kbu.java.example.ch08.Creatures.Util.*;
public class AnimalDemo {
    public static void main(String[] args){
        IAnimal eagle = CreatureFactory.makeCreature("eagle");
        // Dog dog = new Dog();
        // dog.sound();
        
        // Cat cat = new Cat();
        // cat.sound();
    }
}
