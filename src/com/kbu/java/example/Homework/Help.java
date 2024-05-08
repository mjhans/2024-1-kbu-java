package com.kbu.java.example.Homework;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char select;
        do {            
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("q. exit");
            System.out.print("보고 싶은 Control Statement를 선택하세요 : ");            

            select = sc.next().charAt(0);
            System.out.println("");

            switch (select) {
                case '1':
                    System.out.println("if문은 조건식에 따라서 프로그램을 분기해준다.");
                    System.out.println("");
                break;
                case '2':
                    System.out.println("switch문은 특정 케이스에 맞는 프로그램을 만들어준다");
                    System.out.println("");
                break;
                case '3':
                    System.out.println("for문은 반복횟수를 알고 있을때 유용하다");
                    System.out.println("");
                break;
                case '4':
                    System.out.println("while문은 반복횟수를 모를때 유용하다");
                    System.out.println("");
                break;
                case '5':
                    System.out.println("do-while문은 한번은 무조건 실행될때 유용하다");
                    System.out.println("");
                break;
                case 'q':
                    System.out.println("exit..");
                    System.out.println("");
                break;
                default:
                    System.out.println("잘못 입력하셨습니다."); 
            }
        } while (select != 'q');
    }
}