package com.kbu.java.example.ch08.InheritanceShape;

public class Triangle extends Line {
    Point p3;
    Triangle(){
        super();
        this.p3 = new Point();
    }

    Triangle(Point p1, Point p2, Point p3){
        super(p1, p2);
        this.p3 = p3;
    }
    
    public void draw() { 
        System.out.println(
            String.format(
                "좌표 : %s , %s , %s Triangle 그리기"
                , p1.getPointInfo()
                , p2.getPointInfo()
                , p3.getPointInfo()
            )
        );
    }
}
