package com.kbu.java.example.ch08.Creatures.impl;

public class SuperEagle extends Eagle{
    public SuperEagle(){

    }
    
    public void sound(){
        System.out.println("Super " + this.getAnimalName() + " : KKKKKKkkiii!!");
    }

    public void Fly(){
        System.out.println("Super " + this.getAnimalName() + " can fly, 더 멀리");
    }
 
}
