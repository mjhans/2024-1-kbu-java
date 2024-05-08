package com.kbu.java.example.ch04;
/*
 * File name Ladder.java
 */

import java.util.Scanner;

public class Ladder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1~4 사이의 정수를 입력하세요: ");
        int x = sc.nextInt();

        if (x == 1){
            System.out.println("x는 1");
        } else if(x == 2) {
            System.out.println("x는 2");
        } else if(x == 3) {
            System.out.println("x는 3");
        } else if(x == 4) {
            System.out.println("x는 4");
        } else {
            System.out.println("x는 1~4 사이의 값이 아니다. (" + x + ")");
        }
    }    
}