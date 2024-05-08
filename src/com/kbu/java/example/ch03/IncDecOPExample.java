package com.kbu.java.example.ch03;

class IncDecOPExample {
    public static void main(String[] args){
        int x = 1;
        int y = 1;

        int result1 = x++ + 10; // int result1 = x; x = x+1;
        int result2 = ++y + 10; // int result2 = y = y + 1;

        System.out.println("result 1 : " + result1 + ", result 2 : " + result2);
    }
}


