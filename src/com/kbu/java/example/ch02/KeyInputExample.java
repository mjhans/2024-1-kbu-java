package com.kbu.java.example.ch02;

public class KeyInputExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode : " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode : " + keyCode);
        
        keyCode = System.in.read();
        System.out.println("keyCode : " + keyCode);

    }
}
