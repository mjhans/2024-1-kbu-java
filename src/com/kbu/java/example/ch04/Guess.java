package com.kbu.java.example.ch04;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        char ch = 'k';

        Scanner sc =  new Scanner(System.in);
        
        char input;
        do {
            System.out.println("quit 0");

            System.out.println("I'm thinking of a letter a ~ z.");
            System.out.print("Can you guess it: ");
            input = sc.next().charAt(0);

            if (input >= 'a' & input <= 'z'){
                if(input < ch ) {
                    System.out.println("Low");
                } else if (input > ch){
                    System.out.println("High");
                } else if (input == ch){
                    System.out.println("Right!!");
                    break;
                } else {
                    // empty
                }

            } else if (input == '0'){
                System.out.println("Exit");
            } 
            else {
                System.out.println("잘못된 값을 입력했습니다. ");
            }
        } while(input != '0');
        


    }
}
