package com.kbu.java.example.ch05;

public class TwoDimArrayDemo{
    public static void main(String[] args){
        int[][] iArray = new int[3][5];
        //iArray.length는 2차원 배열의 행(row)의 수
        for (int i = 0 ; i < iArray.length ; i++){ 
            // iArray[0].length는 1행에 있는 배열의 길이
            for (int j = 0 ; j < iArray[i].length; j++){
                iArray[i][j] = (int)(Math.random() * 100.0);
            }
        }

        System.out.println("iArray[0][1] : " + iArray[0][1]);
        System.out.println("iArray[2][2] : " + iArray[2][2]);
        //System.out.println("iArray[3][1] : " + iArray[3][1]); 에러!!
        
        System.out.println("---------- array iteration ----------");
        for (int i = 0 ; i < iArray.length ; i++){ 
            for (int j = 0 ; j < iArray[i].length; j++){
                System.out.println("iArray[" + i + "][" + j + "] : "+ iArray[i][j]);
            }
        }

        
    }
}