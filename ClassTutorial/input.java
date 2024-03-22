import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("문자열 입력하세요 : ");
        // String input1 = sc.nextLine();  // nextline함수를 통해서 입력받은 값을 저장

        // System.out.println("input1 : " + input1);

        System.out.print("숫자를 입력하세요 : ");
        //.String input2 = sc.nextLine();  // nextline함수를 통해서 입력받은 값을 저장 
        //int inputInt = Integer.parseInt(input2);
        int inputInt = sc.nextInt();
        //System.out.println("input2 : " + (input2 + 1));
        System.out.println("inputInt : " + (inputInt + 1));

        // int keycode1 = System.in.read(); // a
        // System.out.println(keycode1);

        // int keycode2 = System.in.read(); // 엔터키
        // System.out.println(keycode2);

        // int keycode3 = System.in.read();  // 3
        // System.out.println(keycode3);


    }
}
