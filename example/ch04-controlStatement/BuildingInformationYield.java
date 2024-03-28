/*
 * File: BuildingInformationYield.java
 */
import java.util.Scanner;

class BuildingInformationYield {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("층수를 입력해주세요:");
        int floor = sc.nextInt();
        

        String result = switch (floor) {
            case 1, 2 -> floor + "층은 스타벅스입니다.";
            case 3, 4, 5 -> floor + "층은 피부과입니다.";
            case 6 -> floor + "층은 학원입니다.";
            case 7, 8 -> floor + "층은 스터디 카페";
            case 9, 10 -> floor + "층은 헬스장";
            default -> floor + "층은 없습니다.";
        };

        System.out.println(result);
    }
}