public class PromotionExample {
    public static void main(String[] args) {
        byte byteVal = 10;
        int intValue = byteVal; // 자동 타입 변환
        System.out.println("intValue = " + intValue);

        char charValue = 'A';
        intValue = charValue;      // 65가 저장된다
        System.out.println("A의 코드값 : " + intValue);

        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);

        // int intCharValue = 66;
        // char charValue2 = intCharValue; // 범위가 int가 더 크기 때문에 error

        // byte byteCharValue = 65;
        // char charValue3 = byteCharValue; //byte는 음수를 포함하는데, char은 음수가 없어서 error

    }
}
