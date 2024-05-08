package com.kbu.java.example.ch06;

import java.util.Scanner;

public class  PrimeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.println("Prime numbers between 1 and " + N + " are:");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        
        boolean result = true;

        if (num <= 1) {
            result = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
