package com.kbu.java.example.ch08.ClassInheritance.Car;

class SportsCar extends Car{
    public SportsCar(){
        this.maxPeople = 2;
        //this.wheel = 4; // wheel 변수는 사용할수 없다.
    }

    boolean boosterOn(){
        System.out.println("boost!!");
        this.currentSpeed += 50;
        return true;
    }
}
