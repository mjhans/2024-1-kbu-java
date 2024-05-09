package com.kbu.java.example.ch08.ClassInheritance.Car;

class AccessModifierSportsCar extends AccessModifierCar{

    AccessModifierSportsCar(){
        super("", 0);
    }

    boolean boosterOn(){        
        System.out.println("boost!!");
        this.currentSpeed += 50;        
        return true;
    }
}
