package com.kbu.java.example.ch04;

/*
 * File name LadderSwitch.java
 */

import java.util.Scanner;

class LadderSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1~4 사이의 정수를 입력하세요: ");
        int x = sc.nextInt();
        final int y = 1;
        switch(x){
            case y:
                System.out.println("x는 1");
                break;                
            case 2:
                System.out.println("x는 2");
                break;
            case 3:
                System.out.println("x는 3");
                break;                
            case 4:
                System.out.println("x는 4");
                break;                
            default:
                System.out.println("x는 1~4 사이의 값이 아니다. (" + x + ")");
        }
    }    
}