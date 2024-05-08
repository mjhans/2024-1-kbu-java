package com.kbu.java.example.ch03;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 10;
        System.out.println("result = 10 : " + result);

        // result++; //result = result+ 1;
        // result += 3;
        result += 2;
        System.out.println("result += 2 : " + result);

        result -= 5;
        System.out.println("result -= 5 : " + result);

        result *= 5;
        System.out.println("result *= 5 : " + result);

        result /= 5;
        System.out.println("result /= 5 : " + result);
        
        result %= 3;
        System.out.println("result %= 3 : " + result);
    }
}
