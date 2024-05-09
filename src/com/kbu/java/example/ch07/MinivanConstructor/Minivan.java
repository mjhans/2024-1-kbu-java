package com.kbu.java.example.ch07.MinivanConstructor;

public class Minivan {
    private int passengers;      // 승객 수
    private int fuelcap;         // 사용한 연료의 용량
    private final int mpg = 3;          // mile per gasoline, 마일당 연료 소모량, 상수
    public final int PAYMENT_COEFFICIENT = 2000;

    Minivan(){}

    Minivan(int p){
        passengers = p;
    }
    Minivan(int p, double f){
        passengers = p;
        setFuelcap((int)f);
    }
    Minivan(double f, int p){
        passengers = p;
        setFuelcap((int)f);
    }

    Minivan(int p, int f){
        setPassengers(p);
        setFuelcap(f);
    }

    public void setPassengers(int pass){
        passengers = pass;
    }
    public void setFuelcap(int f){
        fuelcap = f;
    }
    public int getPassengers(){
        return passengers;
    }
    public int getFuelcap(){
        return fuelcap;
    }
    public int getMPG(){
        return mpg;
    }    
    public int getDistance(){
        return fuelcap * mpg;
    }
    public int getPayments(){
        return getDistance() * PAYMENT_COEFFICIENT;
    }
    public String billInfo(){
        return String.format(
                "passengers : %s, \n\t- distance : %s, \n\t- payments : %s \n"
                , passengers
                , getDistance()
                , getPayments()
            );
    }
}
