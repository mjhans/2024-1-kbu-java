package com.kbu.java.example.ch11.Generic.App;

import com.kbu.java.example.ch11.Generic.Printable;
import com.kbu.java.example.ch11.Generic.Printer.GeneralPrinter;
import com.kbu.java.example.ch11.EnumShape.Shape;
import com.kbu.java.example.ch11.EnumShape.App.DrawDemo;
import com.kbu.java.example.ch11.EnumShape.Constants.ShapeType;
import com.kbu.java.example.ch11.EnumShape.impl.*;

public class GenericShapeDemo {
    public static void main(String[] args){
       
        Shape line1 = DrawDemo.createShape( ShapeType.LINE ,new Point(3,4), new Point(1, 2));
        Shape triangle1 = DrawDemo.createShape(ShapeType.TRIANGLE, new Point(1,1), new Point(3,4), new Point(5,1));
        Shape rectangle1 = DrawDemo.createShape(ShapeType.RECTANGLE, new Point(1,1), new Point(4,4), new Point(1,4), new Point(4, 1));

        DrawPanel drawPane = new DrawPanel();

        drawPane.addShape(line1, triangle1, rectangle1);
        drawPane.Draw();
        line1.setColor("Blue");
        triangle1.setColor("Red");
        rectangle1.setColor("white");
        drawPane.Paint();

        line1.setColor("black");
        drawPane.Paint();

        //GeneralPrinter gp = new GeneralPrinter();
        GeneralPrinter<Printable> gp = new GeneralPrinter<>();
        gp.setItem(line1);
        gp.print();

        gp.setItem(triangle1);
        gp.print();

        gp.setItem(rectangle1);
        gp.print();        
    }    
}
