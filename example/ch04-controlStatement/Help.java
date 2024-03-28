/*
 * File name Help.java
 */

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String select;
            
        System.out.println("1. if");
        System.out.println("2. switch");

        System.out.print("번호를 선택하세요: ");
        select = sc.nextLine();

        switch (select) {
            case "1":
                System.out.println("if help");
            break;
            case "2":
                System.out.println("switch help");
            break;
            default:
                System.out.println("잘못 입력하셨습니다."); 
        }
    }
}
