package com.kbu.java.example.Homework.RTSGame.Units;

import com.kbu.java.example.Homework.RTSGame.Play.Player;
import com.kbu.java.example.Homework.RTSGame.Utils.*;

public abstract class Unit {
    protected String unitName = null;
    protected Point current = null;
    protected UnitType unitType = null;
    protected Player owner = null;

    public Unit(Point current){
        this(current, UnitType.DEFAULT);
    }
    protected Unit(Point current, UnitType unitType){
        this.setCurrent(current);
        // 유닛의 종류는 유닛이 처음 생성될때 정해진다. 외부에서 변경할 수 없다.
        this.unitType = unitType;
    }
    public void setOwner(Player owner){
        this.owner = owner;
    }

    public Player getOwner() throws Exception{
        if (this.owner == null){
            throw new Exception("Owner is not set yet");
        }
        return this.owner;
    }

    // 위치 변경은 IMovable의 moveTo 메소드를 통해서만 가능하다. 
    public void setCurrent(Point current){
        this.current = current;
    }
    public Point getCurrent() throws Exception{
        if (this.current == null){
            throw new Exception("Unit is not placed yet");
        }
        return this.current;
    }
   
    public UnitType getUnitType() throws Exception{
        if (this.unitType == null || this.unitType == UnitType.DEFAULT){
            throw new Exception("Unit type is not set yet");
        }
        return this.unitType;
    }

    // 유닛의 이름은 외부에서 변경할 수 있다.
    public void setUnitName(String unitName){
        this.unitName = unitName;
    }

    public String getUnitName() throws Exception{ 
        if (this.unitName == null){
            throw new Exception("Unit name is not set yet");
        }
        return this.unitName;
    }

    public String toString(){
        try {
            return String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
        } catch (Exception e) {
            return "Unit is not placed yet";
        }
    }   

}
