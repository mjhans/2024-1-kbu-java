package com.kbu.java.example.ch09.App;

import java.io.IOException;
import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args){
        try {
        int[] arr = new int[5];

        
            int a = arr[5];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("exit");
    }
}