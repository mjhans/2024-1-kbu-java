package com.kbu.java.example.Homework;

public class DuplicateChecker {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int[] frequency = new int[11];  // Array to count frequency of numbers 1-10

        // Fill the array with random numbers from 1 to 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
        }

        // Count the frequency of each number
        for (int number : numbers) {
            frequency[number]++;
        }

        // Display the results
        System.out.println("중복된 숫자 갯수 출력:");
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > 0) {  // Check if the number appears more than once
                System.out.println("숫자 " + i + " : " + frequency[i] + " 개");
            }
        }
    }
}
