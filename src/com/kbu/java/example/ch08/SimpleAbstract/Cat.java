package com.kbu.java.example.ch08.SimpleAbstract;

public class Cat extends Animal {
    
    public Cat(){
        super.category = "Cat";
    }

    public void sound() {
        System.out.println("Meow");
    }
    
}
