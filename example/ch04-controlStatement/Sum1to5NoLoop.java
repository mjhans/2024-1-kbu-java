/*
 * File: Sum1to5NoLoop.java
 */
public class Sum1to5NoLoop {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum += 3;
        sum += 4;
        sum += 5;
        System.out.println("1부터 5까지의 합은 " + sum + "입니다.");
    }
}
