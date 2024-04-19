public class ArraySwap {
    static int[] swap(int[] a, int x, int y){ // x = 10, y = 40
        int temp = a[x]; // a[10] 2
        a[x] = a[y];     // a[40] 5
        a[y] = temp; 
        return a;
    }
    static void printArray(int[] targetArray){
        for (int value : targetArray) {
            System.out.print(value + ", ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        // 길이 5인 배열 생성 및 초기화
        int[] a = {10, 20, 30, 40, 50};
        System.out.print("원본 배열 : ");
        printArray(a);
        int[] result = swap(a, a[0], a[3]);

        System.out.print("바뀐 배열 : ");
        printArray(result);
        System.out.print("a 배열 : ");
        printArray(a);

    }
}
