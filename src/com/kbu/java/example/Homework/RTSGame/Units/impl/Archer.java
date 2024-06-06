package com.kbu.java.example.Homework.RTSGame.Units.impl;

import java.util.ArrayList;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;


public class Archer extends Unit implements IWalkable, IAirAttackable, ILandAttackable{

    public Archer(Point current) {
        super(current, UnitType.ARCHER);
    }

    @Override
    public Point moveTo(Point destination) throws Exception{
        
        try {
            this.setCurrent(destination);
            String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
            System.out.println(unitInfo + " is walking to " + destination.toString());
        } catch (Exception e) {
            throw new Exception(e.getMessage() + " in " + this.getUnitName() + " moveTo method");
        }
        return destination;
    }

    @Override
    public ArrayList<Unit> attack(ArrayList<Unit> targets) throws Exception{
        ArrayList<Unit> attackableTargets = new ArrayList<>();
        for (Unit target : targets) {
            if (target instanceof IWalkable || target instanceof IFlyable){
                try {
                    String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
                    System.out.println(unitInfo + " is attacking " + target);
                } catch (Exception e) {
                    throw new Exception(e.getMessage() + " in " + this.getUnitName() + " attack method");
                }                
                attackableTargets.add(target);
            }
        }
        return attackableTargets;
    }

}
