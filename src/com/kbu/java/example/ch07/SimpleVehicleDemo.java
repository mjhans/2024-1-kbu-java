package com.kbu.java.example.ch07;

class Vehicle {
    public int passengers;      // 승객 수
    public int fuelcap;         // 연료의 효율
    public int mpg;             // mile per gasoline, 마일당 연료 소모량


    public int range(){
        return fuelcap * mpg;
    }
}



class VehicleDemo {
    public static void main(String[] args){
        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        int range_minivan = minivan.fuelcap * minivan.mpg;
        String msg_minivan = String.format("[minivan] passengers : %s ,  range : %s", 
                                            minivan.passengers, 
                                            range_minivan);
        System.out.println(msg_minivan);


        Vehicle sportscar = new Vehicle();
        sportscar.passengers = 2;
        sportscar.fuelcap = 40;
        sportscar.mpg = 8;
        int range_sportscar = sportscar.fuelcap * sportscar.mpg;

        String msg_sportscar = String.format("[sportscar] passengers : %s , range : %s", 
                                            sportscar.passengers, 
                                            range_sportscar);
        System.out.println(msg_sportscar);
    }
}