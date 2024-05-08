package com.kbu.java.example.quiz;

import java.util.Scanner;

public class InputFtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨 온도 입력 : ");
        String strF = sc.nextLine();
        double F = Double.parseDouble(strF);
        double C = 5.0/9.0 * (F - 32);

        System.out.println("화씨 온도 : " + F );
        System.out.println("섭씨 온도 : " + C );
    }
}
