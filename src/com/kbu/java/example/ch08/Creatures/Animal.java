package com.kbu.java.example.ch08.Creatures;

public abstract class Animal {
    private String animalName;

    protected Animal(String name){
        this.animalName = name;
    }
    protected String getAnimalName(){
        return this.animalName;
    }

    public abstract void sound();
}
