package com.kbu.java.ClassTutorial.ch07;

class Vehicle {
    public int passengers;      // 승객 수
    public int fuelcap;         // 연료의 효율
    public int mpg;             // mile per gasoline, 마일당 연료 소모량

    private long calculateRange(){
        return (long)(fuelcap * mpg);
    }

    public String getText(){
        String s = String.format("passengers : %s , range : %s", passengers, calculateRange());
        return s;

    }
}

class VehicleDemo {
    public static void main(String[] args){
        Vehicle minivan = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 80;
        minivan.mpg = 9;

        
        System.out.println(minivan.getText());

        Vehicle sportscar = new Vehicle();
        sportscar.passengers = 2;
        sportscar.fuelcap = 40;
        sportscar.mpg = 12;
        System.out.println(sportscar.getText());
    }
}

