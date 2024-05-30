package com.kbu.java.example.ch11.EnumShape.impl;

import com.kbu.java.example.ch11.EnumShape.Shape;

public class Line extends Shape{
    protected Point A = null;
    protected Point B = null;

    public Line(Point A, Point B){
        this.A = A;
        this.B = B;
    }
    
    @Override
    public void Draw(){
        System.out.printf("(%s) draw with points (%s, %s) (%s, %s) \n", this.getClass().getName(), A.getX(), A.getY(), B.getX(), B.getY());
    }

    @Override
    public void Paint(){
        if (this.color.isEmpty() || this.color.equals("")){
            System.out.printf("painted [%s] no color \n", this.getClass().getName());
        } else {
            System.out.printf("painted [%s] %s \n", this.getClass().getName(), this.color);
        }        
    }
}
