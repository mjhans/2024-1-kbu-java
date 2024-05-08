package com.kbu.java.example.ch02;

public class StringConcatExample {
    public static void main(String[] args) {
        int iVal = 10 + 2 + 2;
        System.out.println("iVal : " + iVal);

        // 문자열 연결
        String str1 = 10 + 2 + "2";
        System.out.println("str1 : " + str1);

        String str2 = "10" + (2 + 2);
        System.out.println("str2 : " + str2);

    }
}
