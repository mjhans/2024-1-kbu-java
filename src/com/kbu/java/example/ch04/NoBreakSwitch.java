package com.kbu.java.example.ch04;

/*
 * File name NoBreakSwitch.java
 */

import java.util.Scanner;

class NoBreakSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1~4 사이의 정수를 입력하세요: ");
        int x = sc.nextInt();

        switch(x){
            case 1:
                System.out.println("x는 1");                
            case 2:
                System.out.println("x는 2");
            case 3:
                System.out.println("x는 3");
            case 4:
                System.out.println("x는 4");
            default:
                System.out.println("x는 1~4 사이의 값이 아니다. (" + x + ")");
        }
    }    
}