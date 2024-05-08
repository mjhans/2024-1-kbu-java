package com.kbu.java.example.ch02;

public class ParsingExample {
    public static void main(String[] args) {
        String str1 = "10.1";

        //int iVal = Integer.parseInt(str1); // compile Error
        int iVal = (int)Double.parseDouble(str1);
        double dVal = Double.parseDouble(str1);

        System.out.println("iVal : " + iVal + ", dVal : " + dVal);
        System.out.println("iVal + dVal =  " + (iVal + dVal));

        String str2 = String.valueOf(iVal);
        String str3 = String.valueOf(dVal);
        String str4 = String.valueOf(true);

        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);



    }

}
