package com.kbu.java.example.ch08.Creatures;

public abstract class AbstractAnimal {
    private String animalName;

    protected AbstractAnimal(String name){
        this.animalName = name;
    }
    protected String getAnimalName(){
        return this.animalName;
    }

    public abstract void sound();
}
