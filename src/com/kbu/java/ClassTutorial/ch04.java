package com.kbu.java.ClassTutorial;

public class ch04 {
    public static void main(String[] args) {
        byte a = 1;

        // byte result = (byte)(a + a); 
        // int b = 5;
        // int c = 3;
        // double r = (double)c / (double)b;
        // System.out.println(r);

        // int x = 4;
        // if (x == 1){
        //     System.out.println("x는 1");
        // } else if(x == 2) {
        //     System.out.println("x는 2");
        // } else if(x == 3) {
        //     System.out.println("x는 3");
        // } else if(x == 4) {
        //     System.out.println("x는 4");
        // } else {
        //     System.out.println("x는 1~4 사이의 값이 아니다. (" + x + ")");
        // }
        
        // //if-if 문과 if-else-if 문의 차이는 조건 검사를 여러번 하지 않는다. 
        // if (x == 1){
        //     System.out.println("x는 1");
        // }
        // if(x == 2) {
        //     System.out.println("x는 2");
        // }
        // if(x == 3) {
        //     System.out.println("x는 3");
        // }
        // if(x == 4) {
        //     System.out.println("x는 4");
        // } 
        // if(x > 4) {
        //     System.out.println("x는 1~4 사이의 값이 아니다. (" + x + ")");
        // }

        // String s = "Foo";

        // String result = switch (s) {
        //     case "Foo": 
        //         yield "1";
        //     case "Bar":
        //         yield "3";
        //     default:
        //         System.out.println("Neither Foo nor Bar, hmmm...");
        //         yield "5";
        // };
        // System.out.println("result : " + result);

        // // 스위치 표현식에서 int 값을 리턴하는 예
        
        // String day = "monday";        
        // int j = switch (day) {
        //     case "monday" -> 0;
        //     case "tuesday" -> 1;
        //     default -> { 
        //         System.out.println("Neither Monday nor Tuesday, hmmm...");               
        //         yield (1 * 5);
        //     }
        // };
        // System.out.println("j : " + j);
        // int i = 0;
        // for (;;){
        //     System.out.println(i++);
        // }
        
        // while(true){
        //     int n = (int)(Math.random() * 100) % 6;
        //     if (n == 4) {
        //         break;
        //     }
        //  }
        for (int i = 1; i <= 10 ; i++){
            if(i % 2 != 0){
                System.out.println("홀수!");
                //continue;
            } else {
                System.out.println(i);
            }
            
        }

    }
}
