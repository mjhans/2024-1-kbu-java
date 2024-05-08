package com.kbu.java.example.ch07.SimpleMinivan;

class MinvanDemo {
    public static void main(String[] args) {
        Minivan minivan = new Minivan();

        minivan.passengers = 8;
        minivan.fuelcap = 80;

        System.out.printf("Minivan's \n\t- %s", minivan.billInfo());

    }
}
