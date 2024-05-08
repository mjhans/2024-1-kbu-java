package com.kbu.java.example.ch02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        System.out.println("input : " + input);

        sc.close();
    }
}
