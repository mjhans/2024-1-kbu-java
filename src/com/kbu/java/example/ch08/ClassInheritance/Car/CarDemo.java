package com.kbu.java.example.ch08.ClassInheritance.Car;

public class CarDemo {
    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.accelerator(100);
        // int i = myCar.getWheel();
        // System.out.println("car current speed : " + myCar.getCurrentSpeed());

        // SportsCar mySportsCar = new SportsCar();
        // //System.out.println("sportscar max people : " + mySportsCar.maxPeople);
        // mySportsCar.accelerator(100);
        // //System.out.println(mySportsCar.toString());
        // System.out.println("sportscar current speed : " + mySportsCar.getCurrentSpeed());
        // mySportsCar.boosterOn();
        // System.out.println("sportscar current speed : " + mySportsCar.getCurrentSpeed());
        // System.out.println("sportscar wheel count : " + mySportsCar.getWheel());


        OverrideSportsCar mySportsCar2 = new OverrideSportsCar();
        //System.out.println("sportscar2 max people : " + mySportsCar2.maxPeople);
        mySportsCar2.accelerator(100);
        System.out.println("sportscar2 current speed : " + mySportsCar2.getCurrentSpeed());
        mySportsCar2.boosterOn();
        mySportsCar2.accelerator(20);
        System.out.println("sportscar2 current speed : " + mySportsCar2.getCurrentSpeed());

        mySportsCar2.accelerator();
        System.out.println("sportscar2 current speed : " + mySportsCar2.getCurrentSpeed());


        
        System.out.println("sportscar2 wheel count : " + mySportsCar2.getWheel());
    }
}
