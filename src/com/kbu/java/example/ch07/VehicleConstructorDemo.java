package com.kbu.java.example.ch07;

class Vehicle {
    public int passengers;      // 승객 수
    public int fuelcap;         // 연료의 효율
    public int mpg;             // mile per gasoline, 마일당 연료 소모량

    
    public Vehicle(){}

    public Vehicle(int passengers){
        this.passengers = passengers;
    }

    public Vehicle(int passengers, int fuelcap){
        //this.passengers = passengers;
        this(passengers);
        this.fuelcap = fuelcap;
    }
    
    public Vehicle(int passengers, int fuelcap, int mpg){
        this(passengers, fuelcap);
        this.mpg = mpg;
    }

    public int range(){
        return fuelcap * mpg;
    }
}


class VehicleConstructorDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        
        int range_minivan = minivan.range();
        String msg_minivan = String.format("[minivan] passengers : %s ,  range : %s", 
                                            minivan.passengers, 
                                            range_minivan);
        System.out.println(msg_minivan);


        Vehicle sportscar = new Vehicle(2, 40, 8);
        
        int range_sportscar = sportscar.range();
        String msg_sportscar = String.format("[sportscar] passengers : %s , range : %s", 
                                            sportscar.passengers, 
                                            range_sportscar);
        System.out.println(msg_sportscar);
    }
}
