package com.kbu.java.example.Homework;

import java.util.Scanner;

public class SimpleUserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("[필수 정보 입력]");
        System.out.print("이름\t\t: ");
        String strName = sc.nextLine();
        System.out.print("나이\t\t: ");
        String strAge = sc.nextLine();
        System.out.print("메일주소\t: ");
        String strMail = sc.nextLine();

        System.out.println("");
        System.out.println("");

        System.out.println("[입력된 내용]");
        System.out.println("이름\t\t: " + strName);
        System.out.println("나이\t\t: " + strAge);
        System.out.println("메일주소\t: " + strMail);
    }
}
