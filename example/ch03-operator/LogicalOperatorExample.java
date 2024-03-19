public class LogicalOperatorExample {
    public static void main(String[] args) {
        int ops1 = 3;
        int ops2 = 4;
        
        System.out.println("ops1 : " + ops1 + " , ops2 : " + ops2);
        boolean result = (ops1 > ops2) & (ops1 < ops2);
        System.out.println("논리 곱 (ops1 < ops2) & (ops1 < ops2) 결과 : " + result);
        
        result = (ops1 > ops2) | (ops1 < ops2);
        System.out.println("논리 합 (ops1 < ops2) | (ops1 < ops2) 결과 : " + result);
    
        result = (ops1 > ops2) && (ops1 < ops2);
        System.out.println("논리 곱 (ops1 < ops2) && (ops1 < ops2) 결과 : " + result);
    
        result = (ops1 > ops2) || (ops1 < ops2);
        System.out.println("논리 곱 (ops1 < ops2) || (ops1 < ops2) 결과 : " + result);

        result = (ops1 > ops2) ^ (ops1 < ops2);
        System.out.println("베타적 논리합 (ops1 < ops2) ^ (ops1 < ops2) 결과 : " + result);

        System.out.println("논리 부정 !(ops1 > ops2) : " + !(ops1 > ops2) + ", !(ops1 < ops2) : " + !(ops1 < ops2));
    }
}
