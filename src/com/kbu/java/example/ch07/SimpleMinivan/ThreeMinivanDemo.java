package com.kbu.java.example.ch07.SimpleMinivan;

class ThreeMinivanDemo {
    public static void main(String[] args) {
        Minivan minivan1 = new Minivan();
        minivan1.passengers = 8;
        minivan1.fuelcap = 80;

        Minivan minivan2 = new Minivan();
        minivan2.passengers = 3;
        minivan2.fuelcap = 10;

        Minivan minivan3 = new Minivan();
        minivan3.passengers = 5;
        minivan3.fuelcap = 100;

        System.out.printf("Minivan1's \n\t- %s", minivan1.billInfo());
        System.out.printf("Minivan2's \n\t- %s", minivan2.billInfo());
        System.out.printf("Minivan3's \n\t- %s", minivan3.billInfo());
    }
}
