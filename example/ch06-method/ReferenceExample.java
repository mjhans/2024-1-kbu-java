public class ReferenceExample {
    static void printArray(int[] arr){
        System.out.print("[");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int originNumber = 30;
        int copyNumber = originNumber;
        System.out.println("originNumber : " + originNumber + ", copyNumber : " + copyNumber);
        originNumber = 40;
        System.out.println("originNumber : " + originNumber + ", copyNumber : " + copyNumber);

        int[] originArray = new int[]{1, 2, 3};
        int[] copyArray = originArray;
        System.out.print("originArray : ");
        printArray(originArray);
        System.out.print("copyArray : ");
        printArray(copyArray);

        copyArray[1] = 50;

        System.out.print("originArray : ");
        printArray(originArray);
        System.out.print("copyArray : ");
        printArray(copyArray);

    }
}
