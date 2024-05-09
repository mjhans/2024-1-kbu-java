package com.kbu.java.example.ch08.ClassInheritance.Car;

class AccessModifierCar extends Car{
    
    private AccessModifierCar(){
        this("", 0);
    }

    AccessModifierCar(String ownerName, int maxPeople){
        this.ownerName = ownerName;
        this.maxPeople = maxPeople;
        this.mpg = 20;
        this.currentSpeed = 0;
    }

    protected AccessModifierCar( int maxPeople, String ownerName){
        this(ownerName, maxPeople);
    }

    public AccessModifierCar(String ownerName){
        this(ownerName, 4);
    }
}
