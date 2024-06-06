package com.kbu.java.example.ch10;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void printFile(String filePath){
        try(FileInputStream fis = new FileInputStream(filePath)){
            int i;
            System.out.printf("**** start: [%s] \n", filePath);
            while ((i = fis.read()) != -1){
                System.out.printf("[%s]\n", (char)i);
            }
            System.out.println("**** end!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        
        printFile("/Users/mjhans/workspaces/personal/2024-1-kbu-java/src/com/kbu/java/example/ch10/Sample01.txt");
        printFile("/Users/mjhans/workspaces/personal/2024-1-kbu-java/src/com/kbu/java/example/ch10/Sample02.txt");
    }
}
