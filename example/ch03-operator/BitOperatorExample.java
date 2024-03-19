public class BitOperatorExample {
    public static void main(String[] args) {
        int a = 0x0F; //16
        System.out.println("a : " + a);

        int result = ~a;
        System.out.println("~a : " + result);

        result = a & 0xF0; //0xF0 => 240
        System.out.println("a & 0xF0 : " + result);

        result = a | 0xF0; //0xF0 => 240
        System.out.println("a | 0xF0 : " + result);

        result = a ^ 0xFF; //0xFF => 256
        System.out.println("a ^ 0xFF : " + result);

        result = a << 2; // 0b00001111 << 2 => 0b00111100
        System.out.println("a << 2 : " + result);

        result = a >> 2; // 0b00001111 >> 2 => 0b00000011
        System.out.println("a >> 2 : " + result);
    }
}
