package com.kbu.java.example.ch03;

import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("원의 반지름 입력 : ");
        int r = sc.nextInt();
        final double PI = 3.14;
        double area = PI * r * r; //원의넓이

        double round = 2 * PI * r;

        System.out.println("넓이 : " + area);
        System.out.println("둘레 : " + round);

    }
}
