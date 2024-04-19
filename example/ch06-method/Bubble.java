class Bubble {
    static int[] swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp; 
        return a;
    }
    static void printArray(int[] targetArray){
        for (int value : targetArray) {
            System.out.print(value + ", ");
        }
        System.out.println("");
    }

    static int[] sort(int[] targetArray){
        int size = targetArray.length; //5
        for(int i = 0 ; i < size - 1; i++){
            for(int j = 0 ; j < size - i - 1 ; j++){
                if(targetArray[j] > targetArray[j + 1]){
                    swap(targetArray, j, j + 1);
                }
            }
        }
        
        return targetArray;
    }

    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22};
        System.out.println("origin array:");
        printArray(a);
        int[] sorted = sort(a);
        System.out.println("Sorted array:");
        printArray(sorted);


    }
}

class FindNumber {
    static int[] createRandomArray(int N){ //100
        int[] allNumbers = new int[N];
        for (int i = 0; i < allNumbers.length ; i++) {
            allNumbers[i] = i + 1;
        }
        for (int i = 0 ; i < N ; i++){
            int shuffleIndex = ((int)(Math.random() * 1000) % (N - 1));

            Bubble.swap(allNumbers, shuffleIndex, i);
        }
        int[] A = new int[50];
        System.arraycopy(allNumbers, 0, A, 0, 50);

        return A;
    }
    static boolean contains(int[] array, int num){
        for(int i = 0 ; i < array.length ; i++){
            if (num == array[i]){
                return true;
            }
        }
        return false;
    }
    static void printMissingNumbers(int[] targetArray){
        for(int i = 1 ; i <= 100 ; i++){
            if (!contains(targetArray, i)){
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        int[] randomArray = createRandomArray(100);
        System.out.println("생성된 배열 : ");
        Bubble.printArray(randomArray);
        System.out.println("없는 숫자 배열 : ");
        printMissingNumbers(randomArray);



        
    }
}
