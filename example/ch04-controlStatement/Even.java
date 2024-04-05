public class Even {
    public static void main(String[] args) {        
        int N = 100;
        int sum = 0;
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
                if (i % 30 == 0) {
                    System.out.println();
                }
                sum += i;
            }
        }
        
        System.out.println();
        System.out.println("1부터 " + N + "까지의 짝수의 합은 " + sum + "입니다.");

        for(int i = 2; i <= N; i += 2){            
            System.out.print(i + ", ");
            if (i % 30 == 0) {
                System.out.println();
            }
            sum += i;
            
        }
    }
}
