package com.kbu.java.example.ch07.MinivanAccessModifier;

//import com.kbu.java.example.ch07.SimpleMinivan.Minivan;

class MinvanDemo {
    public static void main(String[] args) {
        Minivan minivan = new Minivan();
        minivan.setPassengers(8);
        minivan.setFuelcap(80);
        
        //minivan.passengers = 8;
        //minivan.fuelcap = 80;

        System.out.printf("Minivan's \n\t- %s", minivan.billInfo());

    }
}
