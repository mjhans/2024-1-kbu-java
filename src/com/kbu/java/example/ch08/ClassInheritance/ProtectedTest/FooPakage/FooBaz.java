package com.kbu.java.example.ch08.ClassInheritance.ProtectedTest.FooPakage;

public class FooBaz {
    Foo foo = new Foo();
    
    void useFoo(){
        int a = foo.a;
        foo.returnThree();
    }
}
