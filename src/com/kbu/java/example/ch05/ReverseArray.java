package com.kbu.java.example.ch05;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] inputs = new int[5];
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < inputs.length ; i++){
            System.out.print("숫자입력 " + i + " : ");
            inputs[i] = sc.nextInt();
            System.out.println("");            
        }
        for (int input : inputs){
            System.out.print(input + " ");
        }
        System.out.println("");

        for(int i = (inputs.length - 1) ; i >= 0 ; i--){
            System.out.print(inputs[i] + " ");
        }
        System.out.println("");

    }
}
