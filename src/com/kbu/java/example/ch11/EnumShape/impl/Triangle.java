package com.kbu.java.example.ch11.EnumShape.impl;

public class Triangle extends Line {
    Point C = null;

    public Triangle(Point A, Point B, Point C) {
        super(A, B);
        this.C = C;
    }

    @Override
    public void Draw() {
        System.out.printf("(%s) draw with points (%s, %s) (%s, %s) (%s, %s)\n", 
        this.getClass().getName(), A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());
    }
    
}
