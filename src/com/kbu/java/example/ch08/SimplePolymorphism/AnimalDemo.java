package com.kbu.java.example.ch08.SimplePolymorphism;

import com.kbu.java.example.ch08.SimpleAbstract.Animal;
import com.kbu.java.example.ch08.SimpleAbstract.Cat;
import com.kbu.java.example.ch08.SimpleAbstract.Dog;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        cat.showCategoryName();
        System.out.print("cat sound : ");
        cat.sound();

        dog.showCategoryName();
        System.out.print("dog sound : ");
        dog.sound();

        
        Dog dog2 = new Dog();
        Animal anima02 = (Animal)dog2;
        System.out.println("animal type casting result");
        anima02.showCategoryName();
        anima02.sound();

    }
}
