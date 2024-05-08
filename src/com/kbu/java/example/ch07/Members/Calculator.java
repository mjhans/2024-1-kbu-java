package com.kbu.java.example.ch07.Members;

 class Calculator {
    String bodyColor;  // 계산기별로 색깔이 다를수 있다
    static double pi = 3.14; // 어떤 계산기라도 pi 값은 동일하다
	
    String buttonColor;  // 인스턴스 attribute
	void setColor(String color){   // 인스턴스 method
		this.bodyColor = color;
        //double d = pi; // 인스턴스 메소드에서 정적 멤버 사용 가능
        //plus(3, 2); // 인스턴스 메소드에서 정적 멤버 사용 가능
	}

    static int plus(int x, int y ){  // 정적 method
        //String s = buttonColor; // 정적 method에서 인스턴스 멤버를 사용할수 없다.
        //String s = new Calculator().bodyColor; // 반드시 객체를 생성하고 사용
        return x + y;
    }

    static int minus(int x, int y ){  // 정적 method
        return x - y;
    }

}
