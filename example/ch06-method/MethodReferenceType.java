public class MethodReferenceType {

    static void printArray(int[] arr){
        System.out.print("[");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.print("]\n");
    }

    static int[] twiceArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] *= 2;
        }
        int[] result = arr;
        return result;
    }

    static int twiceInt(int arg){
        int result = arg * 2;
        arg *= 2;
        return result; //6
    }

    public static void main(String[] args) {
        int a = 3;
        System.out.println("before : a = " + a);
        int result = twiceInt(a);
        System.out.println("after : a = " + a + ", result = " + result);

        int[] originArray = new int[]{1, 2, 3};        
        System.out.print("before : ");
        printArray(originArray);

        int[] resultArray = twiceArray(originArray);
        System.out.print("after : ");
        printArray(originArray);
        System.out.print("resultArray : ");
        printArray(resultArray);
    }
}
