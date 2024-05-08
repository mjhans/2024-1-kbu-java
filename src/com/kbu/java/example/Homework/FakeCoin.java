package com.kbu.java.example.Homework;

/*
 * 첫번째 저울 사용: a,b,c,d,e,f,g,h 8개의 동전중 a,b,c,d 4개 동전을 2개씩 묶어서 비교한다. 
 *      ab와 cd의 무게가 같다면 가짜 동전은 efgh 중에 있고, abcd는 모두 진짜 동전이 된다.
 *      ab와 cd의 무게가 다르다면 가짜 동전은 abcd중에 있고, efgh는 모두 진짜 동전이 된다.
 * 두번째 저울 사용 : 첫번째 저울 사용 결과에서 가짜 동전이 있는 4개의 동전 중 2개를 선정해서 비교한다
 *      무게가 다를 경우 지금 비교 중인 동전 2개중 하나가 가짜이고, 나머지 2개는 진짜 동전이다. 즉 저울에 비교중인 동전을 제외한 나머지 6개가 진짜 동전디ㅏ. 
 *      무게가 같을 경우 지금 비교 중인 동전 2개가 진짜이고, 나머지 2개 중 하나가 가짜 동전이다. 즉 저울에 비교하지 않은 동전 2개를 제외한 나머지 6개는 모두 진짜 동전이다.
 * 세번째 저울 사용 : 두번째 저울 사용 결과에서 가짜 동전이 있는 2개의 동전중 1개를 선정해서 진짜 동전 6개중의 한개의 동전과 비교한다
 *      무게가 같을 경우 저울에 비교하지 않은 동전 1개가 가짜동전
 *      무게가 다를 경우 저울에 비교한 동전이 가짜동전
 */

public class FakeCoin{
    public static void main(String[] args){
        int a, b, c, d, e, f, g, h;
        a = 10;
        b = 8;     //임의로 무게를 다르게 했음
        c = 10;
        d = 10;
        e = 10;
        f = 10;
        g = 10;
        h = 10;

        if ((a + b) == (c + d)) {            
            if (e == f) {                
                if (e == g) {
                    System.out.println("h 동전이 가짜 입니다.");
                } else {                    
                    System.out.println("g 동전이 가짜 입니다.");
                }
            } else {
                if (a == e) {                    
                    System.out.println("f 동전이 가짜 입니다.");
                } else {                    
                    System.out.println("e 동전이 가짜 입니다.");
                }
            }
        } else {
            if (a == b) {                
                if (a == c) {                    
                    System.out.println("d 동전이 가짜 입니다.");
                } else {                    
                    System.out.println("c 동전이 가짜 입니다.");
                }
            } else {
                if (c == a) {                    
                    System.out.println("b 동전이 가짜 입니다.");
                } else {                    
                    System.out.println("a 동전이 가짜 입니다.");
                }
            }
        }
    }
}