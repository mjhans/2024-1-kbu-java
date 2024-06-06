package com.kbu.java.example.Homework.RTSGame.Units.impl;

import java.util.ArrayList;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class Knight extends Unit implements IWalkable, ILandAttackable{

    public Knight(Point current) {
        super(current, UnitType.KNIGHT);
    }

    @Override
    public Point moveTo(Point destination) throws Exception{
        try {
            this.setCurrent(destination);
            String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
            System.out.println(unitInfo + " is walking to " + destination);
        } catch (Exception e) {
            throw new Exception(e.getMessage() + " in " + this.unitName + " moveTo method");
        }
        return destination;
    }

    @Override
    public ArrayList<Unit> attack(ArrayList<Unit> targets) throws Exception{
        ArrayList<Unit> attackableTargets = new ArrayList<>();
        for (Unit target : targets) {
            if (target instanceof IWalkable){
                try {
                    String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
                    System.out.println(unitInfo + " is attacking " + target);
                } catch (Exception e) {
                    throw new Exception(e.getMessage() + " in " + this.unitName + " attack method");
                }
                attackableTargets.add(target);
            }
        }
        return attackableTargets;
    }

}
