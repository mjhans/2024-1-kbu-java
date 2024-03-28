/*
 * File: ReturnSwitch.java
 */
public class ReturnSwitch {
    public static void main(String[] args) {
        // 스위치 문장에서 int 값 리턴 예
        String s = "Foo";
        int result = switch (s) {
            case "Foo": 
                yield 1;
            case "Bar":
                yield 2;
            default:
                System.out.println("Neither Foo nor Bar, hmmm...");
                yield 0;
        };
        System.out.println("result : " + result);

        // 스위치 표현식에서 int 값을 리턴하는 예
        String day = "monday";        
        int j = switch (day) {
            case "monday" -> 0;
            case "tuesday" -> 1;
            default -> { 
                System.out.println("Neither Monday nor Tuesday, hmmm...");               
                yield -1;
            }
        };
        System.out.println("j : " + j);
   }
}
