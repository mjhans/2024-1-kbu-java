/*
 * file: Sum1to5Loop.java
 */

public class Sum1to5Loop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1부터 5까지의 합은 " + sum + "입니다.");
    }
}
