package com.kbu.java.example.ch08.SimpleAbstract;


public class AnimalDemo {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        dog.showCategoryName();
        
        Cat cat = new Cat();
        cat.sound();
        cat.showCategoryName();
    }
}
