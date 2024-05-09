package com.kbu.java.example.ch08.UseInterface.App;

import com.kbu.java.example.ch08.UseInterface.impl.*;

public class animalDemo {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        
        Cat cat = new Cat();
        cat.sound();
    }
}
