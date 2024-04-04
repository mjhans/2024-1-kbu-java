public class ArrayDemo{
    public static void main(String[] args){
        int[] intArray = new int[5];
        int[] myArray = intArray;

        intArray[0] = 2;
        myArray[1] = 6;

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("intArray[" + i + "] : " + intArray[i]);
            System.out.println("myArray[" + i + "] : " + myArray[i]);
        }
    }
}