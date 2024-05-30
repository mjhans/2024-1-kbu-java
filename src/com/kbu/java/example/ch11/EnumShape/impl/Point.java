package com.kbu.java.example.ch11.EnumShape.impl;

public class Point {
    protected int x = 0;
    protected int y = 0;

    public Point(){
        init(0, 0);
    }
    public Point(int x, int y){
        init(x, y);
    }
    protected void init(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
