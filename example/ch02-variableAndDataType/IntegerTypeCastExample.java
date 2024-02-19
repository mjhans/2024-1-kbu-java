public class IntegerTypeCastExample {
    public static void main(String[] args) {
        byte byteVal = 10;
        int intVal = byteVal; // 자동 타입 변환

        long longValue = 500L;
        float floatValue = longValue;  // 자동 타입 변환
        float doubleValue = longValue; // 자동 타입 변환

        char charValue = 'A';
        int intValue = charValue;      // 65가 저장된다

        System.out.println(intVal + " " + longValue + " " +
         floatValue + " " + doubleValue);

        byte x = 20;
        byte y = 20;
        //byte result = x + y;  // error 
        int result = x + y;

        byte result2 = 20 + 20; 
    }
}
