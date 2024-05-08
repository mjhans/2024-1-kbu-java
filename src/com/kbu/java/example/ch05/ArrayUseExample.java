package com.kbu.java.example.ch05;

public class ArrayUseExample {
    public static void main(String[] args) {
        
        int score1 = 83;
        int score2 = 93;
        int score3 = 23;
        int score4 = 13;
        int score5 = 63;
        int score6 = 19;
        int score7 = 67;
        int score8 = 67;
        int score9 = 67;
        int score10 = 67;


        int sum = score1;
        sum += score2;
        sum += score3;
        sum += score4;
        sum += score5;
        sum += score6;
        sum += score7;
        sum += score8;
        sum += score9;
        sum += score10;
        

        double avg = sum / 10.0;
        // array
        int[] scores = {83, 93, 23, 13, 63, 19, 67, 67, 67, 67};
        // 
        int[] scores2;
        //scores2 = {83, 93, 23, 13, 63, 19, 67, 67, 67, 67};  // 이렇게 선언하는건 안된다.
        scores2 = new int[]{83, 93, 23, 13, 63, 19, 67, 67, 67, 67};
        
        sum = 0;
        for(int i = 0 ; i < scores.length ; i++){
            sum += scores[i];
        }        

        int first = 0;
        System.out.println(scores[first]);
        scores[0] = 100;
        System.out.println(scores[first]);

        // int[] nullArray;
        // nullArray[0] = 4;

    }
}
