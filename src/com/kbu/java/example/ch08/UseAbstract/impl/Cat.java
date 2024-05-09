package com.kbu.java.example.ch08.UseAbstract.impl;

import com.kbu.java.example.ch08.UseAbstract.*;

public class Cat extends AbstractAnimal {
    public Cat(){
        super();
    }
    public Cat(String category){
        super(category);
    }
    public void sound() {
        System.out.println("Meow");
    }
    
}
