package com.kbu.java.example.ch08.ClassInheritance.Car;

public class OverrideSportsCar extends SportsCar{
    private boolean isBoost = false;

    boolean boosterOn(){
        System.out.println("boost on!!");
        isBoost = true;
        return isBoost;
    }
    boolean boostOff(){
        System.out.println("boost off!!");
        isBoost = false;
        return isBoost;
    }

    void accelerator(int speed) {
        if(this.isBoost){
            speed *= 2;
        }
        super.accelerator(speed);
    }
}
