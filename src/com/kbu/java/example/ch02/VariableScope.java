package com.kbu.java.example.ch02;

public class VariableScope {
    public static void main(String[] args) {
        int methodVar = 0;

        if (true) {
            int ifVar = 50;
        } 

        for (int i = 0; i < 1; i++){
            int forVar = 50;
        }

        // methodVar 사용가능
        System.out.println(methodVar);
        // ifVar, forVar 사용 불가능
        //System.out.println(ifVar);
        //System.out.println(forVar);
    }
}
