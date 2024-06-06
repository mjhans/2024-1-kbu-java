package com.kbu.java.example.Homework.RTSGame.Units.impl;

import java.util.ArrayList;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class Griffin extends Unit implements ILandAttackable, IFlyable{

    public Griffin(Point current) {
        super(current, UnitType.GRIFFIN);
    }

    @Override
    public ArrayList<Unit> attack(ArrayList<Unit> targets) throws Exception {
        
        ArrayList<Unit> attackableTargets = new ArrayList<>();
        for (Unit target : targets) {        
            if (target instanceof IWalkable){        
                try {
                    String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
                    System.out.println(unitInfo + " is attacking " + target);
                } catch (Exception e) {
                    throw new Exception(e.getMessage() + " in attack method");
                }
                attackableTargets.add(target);
            }
        }
        return attackableTargets;
    }

    @Override
    public Point moveTo(Point destination) throws Exception{
        try {
            this.setCurrent(destination);
            String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
            System.out.println(unitInfo + " is flying to " + destination.toString());
        } catch (Exception e) {
            throw new Exception(e.getMessage() + " in moveTo method");
        }
        return destination;
    }
    

}
