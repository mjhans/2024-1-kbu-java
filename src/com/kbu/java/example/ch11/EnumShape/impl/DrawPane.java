package com.kbu.java.example.ch11.EnumShape.impl;

import com.kbu.java.example.ch11.EnumShape.*;

public class DrawPane {
    Shape[] shapeList = null;
    public void addShape(Shape ... s) {
        this.shapeList = s;
    }
    public void Draw(Drawble drawble){
        drawble.Draw();
    }
    public void Draw(){
        for (Drawble drawble : this.shapeList){
            this.Draw(drawble);
        }
    }
    public void Paint(Paintable paintable){
        paintable.Paint();
    }

    public void Paint(){
        for (Paintable paintable : this.shapeList){
            this.Paint(paintable);
        }
    }
}
