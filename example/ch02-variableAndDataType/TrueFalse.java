public class TrueFalse {
    public static void main(String[] args){
        boolean b1, b2;
        b1 = true;
        b2 = false;
        System.out.println("b1 : " + b1);
        System.out.println("b2 : " + b2);
        System.out.println("b1 & b2 는" + (b1 & b2));

        if (b1) {
            System.out.println("b1은 " + b1 + "이므로 이 문장이 출력됩니다.");
        } 

        if (b2) {
            System.out.println("b2는 false 이므로 이 문장은 출력되지 않습니다.");
        }

        if (b1 & b2) {
            System.out.println("b1 and b2의 결과가 " + (b1 & b2 ) + "이므로 이 문장은 출력되지 않습니다.");
        } else {
            System.out.println("b1 and b2의 결과가 " + (b1 & b2 ) + "이므로 이 문장이 출력 됩니다.");
        }
    }
}