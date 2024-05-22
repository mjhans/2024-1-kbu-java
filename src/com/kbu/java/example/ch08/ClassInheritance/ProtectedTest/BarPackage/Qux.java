package com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.BarPackage;

import com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.FooPakage.*;

public class Qux extends Foo {
    void useFoo(){
        int a = super.a;
        int b = this.a;
        super.returnThree();
        this.returnThree();
        
        super.returnFour();         //default 접근제한자
        this.returnFour();
        
        
        super.publicReturnFour();
    }
}
