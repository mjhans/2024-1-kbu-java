/*
 * filename RelOps.java
*/
package com.kbu.java.example.ch03;

class CompareOperationExample{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 30;
        double e = 3.14;
        double f = 5.14;
                
        System.out.println("a < b : " + (a < b));	//10 < 20		
        System.out.println("a > b : " + (a > b));
        System.out.println("a + b <= c : " + (a + b <= c));
        System.out.println("a + b >= c : " + (a + b >= c));
        System.out.println("c==d : " + (c == d));
                
        if (a != b) { // if는 관계 연산자의 결과가 참인지 아닌지 판단
            System.out.println("다르다");
        }
                
                
        System.out.println(e == f);
        System.out.println(e != f);
    }
}