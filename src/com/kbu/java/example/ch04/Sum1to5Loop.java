package com.kbu.java.example.ch04;

/*
 * file: Sum1to5Loop.java
 */

public class Sum1to5Loop {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 0; i <= 50000; i++) {
            sum += i;
        }
        //System.out.println(i);
        System.out.println("1부터 5까지의 합은 " + sum + "입니다.");
    }
}
