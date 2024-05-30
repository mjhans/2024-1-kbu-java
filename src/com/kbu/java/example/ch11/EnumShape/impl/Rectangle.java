package com.kbu.java.example.ch11.EnumShape.impl;

public class Rectangle extends Triangle{
    protected Point D = null;
    public Rectangle(Point A, Point B, Point C, Point D) {
        super(A, B, C);
        this.D = D;
    }

    @Override
    public void Draw(){
        System.out.printf("(%s) draw with points (%s, %s) (%s, %s) (%s, %s), (%s, %s) \n", 
        this.getClass().getName(), A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY(), D.getX(), D.getY());
    }
    
}
