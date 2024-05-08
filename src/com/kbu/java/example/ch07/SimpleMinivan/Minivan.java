package com.kbu.java.example.ch07.SimpleMinivan;

public class Minivan {
    public int passengers;      // 승객 수
    public int fuelcap;         // 사용한 연료의 용량
    public final int mpg = 3;          // mile per gasoline, 마일당 연료 소모량, 상수
    public final int PAYMENT_COEFFICIENT = 2000;

    public int getDistance(){
        return fuelcap * mpg;
    }

    public int getPayments(){
        return getDistance() * PAYMENT_COEFFICIENT;
    }

    public String billInfo(){
        return String.format("passengers : %s, \n\t- distance : %s, \n\t- payments : %s \n", passengers, getDistance(), getPayments());
    }
}


