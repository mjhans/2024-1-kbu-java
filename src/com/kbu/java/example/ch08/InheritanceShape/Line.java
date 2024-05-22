package com.kbu.java.example.ch08.InheritanceShape;

public class Line {
    Point p1;
    Point p2;

    String color;

    public Line(){
        this(new Point(), new Point());
    }

    public void setColor(String color){
        this.color = color;
    }

    public void paint(){
        System.out.println(
            String.format(
                "color : %s Line 색칠"
                , this.color
            )
        );
    }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void draw(){        
        System.out.println(
            String.format(
                "좌표 : %s , %s Line 그리기"
                , p1.getPointInfo()
                , p2.getPointInfo()
            )
        );
    }
}
