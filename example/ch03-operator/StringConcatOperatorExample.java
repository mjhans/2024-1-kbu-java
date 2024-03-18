public class StringConcatOperatorExample {
    public static void main(String[] args) {
        String str1 = "JAVA" + 1.17;
        String str2 = str1 + " 쉬워요";

        System.out.println(str2); //JAVA1.17 쉬워요 가 출력

        String str3 = "JAVA" + 3 + 3.0; // JAVA33.0
        System.out.println(str3); //JAVA33.0

        String str4 = 3 + 3.0 + "JAVA"; // 6.0JAVA
        System.out.println(str4); //6.0JAVA
    }
}
