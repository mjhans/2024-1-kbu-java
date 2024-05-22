package com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.BarPackage;

import com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.FooPakage.*;

public class Bar {
    Foo foo = new Foo();
    void useFoo(){
        // int a = foo.a;   // 접근할수 없다
        // foo.returnThree(); // 접근할수 없다
        // foo.returnFour(); // default 접근제한자
        foo.publicReturnFour();
    }
}
