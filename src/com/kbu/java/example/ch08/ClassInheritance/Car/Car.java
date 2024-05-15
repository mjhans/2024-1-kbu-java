package com.kbu.java.example.ch08.ClassInheritance.Car;

public class Car {
    String ownerName;
    int mpg;
    int maxPeople = 4;
    int currentSpeed;
    protected int wheel = 4;

    public boolean onStart(){
        System.out.println("시동을 켯습니다.");
        return true;
    }

    public void accelerator(int speed){
        this.currentSpeed += speed;
    }
    public void accelerator(){
        this.accelerator(1);
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public int getWheel(){
        return this.wheel;
    }
}
