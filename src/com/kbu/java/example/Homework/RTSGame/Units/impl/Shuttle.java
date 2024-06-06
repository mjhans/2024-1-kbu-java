package com.kbu.java.example.Homework.RTSGame.Units.impl;

import java.util.ArrayList;
import java.util.Arrays;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class Shuttle extends Unit implements IFlyable{

    private ArrayList<Unit> loadedUits = new ArrayList<Unit>();
    private int maxLoad = 8;
    
    public Shuttle(Point current) {
        super(current, UnitType.SHUTTLE);
    }

    public ArrayList<Unit> loadUnits(Unit ... units){        
        return this.loadUnits((Unit) Arrays.asList(units));        
    }

    // 유닛을 탑승시키는 메소드
    // 반환값으로 탑승하지 못한 유닛들을 반환
    public ArrayList<Unit> loadUnits(ArrayList<Unit> units){
        // 유닛그룹 중 탑승한 유닛을 저장하는 리스트
        ArrayList<Unit> tempList = new ArrayList<>();
        //System.out.println("Load Units" + units.toString());
        for (Unit u : units) {
            // 유닛 그룹 중 공중유닛이 아닌 경우이면서, 탑승인원이 가득차지 않은 경우
            if (loadedUits.size() < maxLoad && !(u instanceof IFlyable)){
                loadedUits.add(u);
                tempList.add(u);
            } 
        }
        units.removeAll(tempList);
        return units;
    }

    public ArrayList<Unit> unLoadUnits() {
        for (Unit u : this.loadedUits) {
            System.out.println("Unloaded unit: " + u.toString());
        }
        return this.loadedUits;
    }

    @Override
    public Point moveTo(Point destination) throws Exception{
        try {
            this.setCurrent(destination);
            // 탑승한 유닛이 있다면 그 유닛들의 위치 정보도 변경되어야 한다. 
            for (Unit u : this.loadedUits) {
                u.setCurrent(destination);
            }
            String unitInfo = String.format("[%s-%s]-%s",this.getOwner().getPlayerName(), this.getUnitType(), this.getUnitName());
            System.out.println(unitInfo + " is flying to " + destination.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage() + " in " + this.getUnitName() + " moveTo method");
        }
        return destination;
    }
    
}
