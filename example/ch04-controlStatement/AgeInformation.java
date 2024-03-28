/*
 * File name AgeInformation.java
 */

import java.util.Scanner;

public class AgeInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (7 >= age) {
            System.out.println("미취학 아동입니다.");
        } 
        else if (8 <= age & 14 > age) {
            System.out.println("초등학생입니다.");
        }
        else if (14 <= age & 17 > age) {
            System.out.println("중학생입니다.");
        }
        else if (17 <= age & 20 > age) {
            System.out.println("고등학생입니다.");
        }
        else {
            System.out.println("성인입니다.");
        }
    }
}
