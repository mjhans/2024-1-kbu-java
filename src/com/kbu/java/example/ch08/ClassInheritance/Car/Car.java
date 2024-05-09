package com.kbu.java.example.ch08.ClassInheritance.Car;

class Car {
    String ownerName;
    int mpg;
    int maxPeople = 4;
    int currentSpeed;
    private int wheel = 4;

    boolean onStart(){
        System.out.println("시동을 켯습니다.");
        return true;
    }

    void accelerator(int speed){
        this.currentSpeed += speed;
    }

    int getCurrentSpeed(){
        return currentSpeed;
    }

    int getWheel(){
        return this.wheel;
    }
}
