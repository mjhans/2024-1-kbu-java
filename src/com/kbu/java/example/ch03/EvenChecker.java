package com.kbu.java.example.ch03;

import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();

        boolean isEven = (n % 2 == 0) ? true : false;

        System.out.println(n + " is even? " + isEven);
    }
}
