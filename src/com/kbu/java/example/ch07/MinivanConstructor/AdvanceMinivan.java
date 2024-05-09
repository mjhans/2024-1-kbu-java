package com.kbu.java.example.ch07.MinivanConstructor;

public class AdvanceMinivan {
    private int passengers;      // 승객 수
    private int fuelcap;         // 사용한 연료의 용량
    private final int mpg = 3;          // mile per gasoline, 마일당 연료 소모량, 상수
    public final int PAYMENT_COEFFICIENT = 2000;

    AdvanceMinivan(){
        this(0, 0);
    }

    AdvanceMinivan(int passengers){
        this.passengers = passengers;
    }
    private AdvanceMinivan(int passengers, double fuelcap){
        this(passengers);
        setFuelcap((int)fuelcap);
    }
    public AdvanceMinivan(double fuelcap, int passengers){
        this(passengers, fuelcap);
    }
    AdvanceMinivan(int p, int f){
        this.setPassengers(p);
        this.setFuelcap(f);
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
