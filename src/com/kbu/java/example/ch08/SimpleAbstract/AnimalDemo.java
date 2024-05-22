package com.kbu.java.example.ch08.SimpleAbstract;


public class AnimalDemo {
    public static void main(String[] args){

        // Animal[] animals = new Animal[2];
        // animals[0] = new Dog();
        // animals[1] = new Cat();
        
        // for(Animal a : animals){
        //     a.sound();
        //     a.showCategoryName();
        // }

        Dog dog = new Dog();
        dog.sound();
        dog.showCategoryName();
        
        Cat cat = new Cat();
        cat.sound();
        cat.showCategoryName();
    }
}
