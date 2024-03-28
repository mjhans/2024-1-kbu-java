import java.util.Scanner;

public class BuildingInformation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("층수를 입력해주세요:");
        int floor = sc.nextInt();
        
        switch (floor) {
            case 1, 2:
                System.out.println(floor + "층은 스타벅스입니다.");
            break;

            case 3:
            case 4:
            case 5:
                System.out.println(floor + "층은 피부과입니다.");
            break;

            case 6:
                System.out.println(floor + "층은 학원입니다.");
            break;

            case 7:
            case 8:
                System.out.println(floor + "층은 스터디 카페");
            break;

            case 9:
            case 10:
                System.out.println(floor + "층은 헬스장");
            break;

            default:
                System.out.println(floor + "층은 없습니다.");
        }

    }
}