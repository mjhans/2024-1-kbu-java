package com.kbu.java.example.ch08.Creatures;

public abstract class AbstarctBird extends Animal implements Flyable{ 

    protected AbstarctBird(String name) {
        super(name);
    }
    public void Fly(){
        System.out.println(this.getAnimalName() + " can fly");
    }
    
}
