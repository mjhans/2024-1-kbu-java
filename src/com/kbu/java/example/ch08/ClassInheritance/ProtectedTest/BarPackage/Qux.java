package com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.BarPackage;

import com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.FooPakage.*;

public class Qux extends Foo {
    void useFoo(){
        int a = super.a;
        super.returnThree();
        //super.returnFour();         //default 접근제한자
        super.publicReturnFour();
    }
}
