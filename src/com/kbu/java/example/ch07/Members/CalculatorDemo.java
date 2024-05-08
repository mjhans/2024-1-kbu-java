package com.kbu.java.example.ch07.Members;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setColor("red");  // 인스턴스 메소드 사용

        Calculator.minus(3, 2); // 정적 메소드 사용

        cal.plus(3, 2); // 정적 메소드를 인스턴스 멤버처럼 사용할수 있지만, 관례적으로 하지 않는다. 
    }    
}
