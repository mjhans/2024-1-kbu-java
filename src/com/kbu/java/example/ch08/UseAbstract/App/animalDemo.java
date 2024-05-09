package com.kbu.java.example.ch08.UseAbstract.App;

import com.kbu.java.example.ch08.UseAbstract.impl.*;

public class animalDemo {
    public static void main(String[] args){
        Dog dog = new Dog("Dog");
        dog.sound();
        dog.sound(5);
        dog.showCategoryName();
        
        Cat cat = new Cat("Cat");
        cat.sound();
        cat.showCategoryName();
    }
}
