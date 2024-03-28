/*
 * file: ForSum1ToN.java
 */
public class ForSum1ToN {
    public static void main(String[] args) {
        int sum = 0;
        int N = 5;
        
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");

        sum = 0;
        for (int i = 1; i <= N; sum += i++);
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");

        sum = 0;
        int i = 1;
        for (; i < (N + 1) ; i++){
            sum += i;
        }
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");

        sum = 0;
        i = 1;
        for (; i < (N + 1) ;){
            sum += i++;
        }
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");

        sum = 0;
        i = 1;
        for (;;){
            sum += i++;
            if (i > N) {
                break;
            }            
        }
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");

    }    
}
