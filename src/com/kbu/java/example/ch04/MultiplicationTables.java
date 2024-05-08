package com.kbu.java.example.ch04;
/*
 * file name : MultiplicationTables.java
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        for(int i = 2; i < 10 ; i++){
            System.out.println("------------------------------------------------------------");
            System.out.println(i + "단 입니다.");
            for(int j = 1 ; j < 10 ; j++) {
                System.out.println(i + " * " + j + " = " + ( i * j ));
            }
        }    
    }
}
