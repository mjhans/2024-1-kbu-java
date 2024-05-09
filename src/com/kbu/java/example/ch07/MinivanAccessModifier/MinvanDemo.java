package com.kbu.java.example.ch07.MinivanAccessModifier;

class MinvanDemo {
    public static void main(String[] args) {
        Minivan minivan = new Minivan();
        minivan.setPassengers(8);
        minivan.setFuelcap(80);
        
        System.out.println(minivan.getFuelcap());

        //minivan.passengers = 8;
        //minivan.fuelcap = 80;
        //minivan.PAYMENT_COEFFICIENT = 90;

        System.out.println(minivan.PAYMENT_COEFFICIENT);
        System.out.printf("Minivan's \n\t- %s", minivan.billInfo());

    }
}
