package com.kbu.java.example.ch07.MinivanConstructor;

public class MInivanDemo {
    public static void main(String[] args) {
        Minivan m = new Minivan(0, 0);

        Minivan m2 = new Minivan();
        AdvanceMinivan am1 = new AdvanceMinivan(0.0, 0);
        //AdvanceMinivan am2 = new AdvanceMinivan(0, 0.0);
    }
}
