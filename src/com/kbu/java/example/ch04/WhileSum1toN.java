package com.kbu.java.example.ch04;

public class WhileSum1toN {
    public static void main(String[] args) {
        int sum = 0;
        int N = 5;
        int i = 1;  // 조건 제어를 위한 i값 초기화
        // i 도 변수이므로 block Scope 주의 해야 한다

        while (i <= N){
            sum = sum + i; 
            i++;  //sum += i++;
        }
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");
    }
}
