public class ArrayInitDemo {
    public static void main(String[] args) {
        // 배열 선언
        int[] intArray1;
        int intArray2[];

        // 배열 생성
        intArray1 = new int[5];
        intArray2 = new int[5];

        // 배열 선언과 생성을 같이 한다
        char[] charArray1 = new char[5];
        char charArray2[] = new char[5];

        // 배열을 생성하면서, 원소의 값을 초기화
        String[] strArray1 = {"a", "b", "c"};
        String strArray2[] = {"a", "b", "c"};
        
        String[] strArray3;
        String strArray4[];
        strArray3 = new String[]{"a", "b", "c"};
        strArray4 = new String[]{"a", "b", "c"};

    }
}
