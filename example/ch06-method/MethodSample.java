public class MethodSample {

    public static int getRandomNumber(){
        
        double rand = Math.random();
        int result = (int)(rand * 100000);
        
        return result;
    }

    static void showArray(int[] arr){
        for(int elem : arr){
            System.out.println(elem);
        }
    }

    static int add(int x, int y){
        return x + y;
    }

    static boolean isEven(int num){
        boolean result = false;
        if ((num % 2) == 0){
            result = true;
        } 
        return result;
    }

    static int[] createRandomArray(int size){
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++){

            arr[i] = getRandomNumber();
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int num = getRandomNumber();
        System.out.println("Is it " + num + " even? " + isEven(num));           

        int[] randomArray = createRandomArray(5);
        showArray(randomArray);
    }
}
