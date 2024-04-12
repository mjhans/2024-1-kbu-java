import java.util.Scanner;

public class KeyInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요: ");
        int size = sc.nextInt();
        System.out.println("");

        int[] arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("아무숫자나 입력하세요: ");
            arr[i] = sc.nextInt();
            System.out.println("");
        }

        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        double avg = (double)sum / (double)arr.length;

        for(int n : arr){
            System.out.println(n);
        }
        
    }
}
