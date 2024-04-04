public class DoWhileSum1toN {
    public static void main(String[] args) {
        int sum = 0;
        int N = 5;
        int i = 1;

        do {
            sum = sum + i;
            i++;
        } while (i <= N);

        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");
    }
}
