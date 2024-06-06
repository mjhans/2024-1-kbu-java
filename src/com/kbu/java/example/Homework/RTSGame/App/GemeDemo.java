package com.kbu.java.example.Homework.RTSGame.App;

import java.util.ArrayList;

import com.kbu.java.example.Homework.RTSGame.Maps.*;
import com.kbu.java.example.Homework.RTSGame.Play.Player;
import com.kbu.java.example.Homework.RTSGame.Stores.StoreType;
import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Units.impl.Shuttle;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class GemeDemo {
    public static void main(String[] args) throws Exception {
        // 게임에 참여할 플레이어를 만든다.
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        // 게임을 실행할 맵을 만들고 플레이어를 추가한다. (4인용))
        GameMap gameMap = new GameMap(MapType.FOUR, player1, player2);

        // 게임을 시작한다.
        gameMap.start();

        // player1이 유닛 생산 기지를 먼저 만든다
        player1.createUnitStore(StoreType.BARRACK);
        player1.createUnitStore(StoreType.AIRPORT); 
        player1.createUnitStore(StoreType.GRIFFINCHAMBER);

        // 셔틀 4대를 만든다.
        // airport가 없으니 못만든다.
        ArrayList<Unit> Shuttles = player1.CreateUnits(UnitType.SHUTTLE, 4, new Point(3, 4));
        System.out.println("Shuttle count: " + Shuttles.size());

        // 필요한 유닛을 생산하고, 선택한다. 
        ArrayList<Unit> createdUnits = new ArrayList<Unit>();
        ArrayList<Unit> Knights = player1.CreateUnits(UnitType.KNIGHT, 16, new Point(3, 4));
        ArrayList<Unit> Archers = player1.CreateUnits(UnitType.ARCHER, 16, new Point(3, 4));
        ArrayList<Unit> Griffins = player1.CreateUnits(UnitType.GRIFFIN, 5, new Point(3, 4));
        createdUnits.addAll(Knights);
        createdUnits.addAll(Archers);
        createdUnits.addAll(Griffins);
        createdUnits.addAll(Shuttles);
        player1.selectUnits(createdUnits);

        
        // 셔틀에 선택된 유닛을 태운다.        
        // 유닛 하나를 shuttle 1대에 태우고, 선택된 유닛목록에서 제거한다.
        // 공중 유닛일 경우 태우지 않는다. 그래도 선택된 유닛목록에서는 제거한다.
        // shutlle이 꽉 찼으면, 다음 shuttle에 태운다.
        System.out.println("Shuttle is loading units");
        for (Unit shuttle : Shuttles) {
            if (shuttle instanceof Shuttle) {
                Shuttle s = (Shuttle) shuttle;                
                ArrayList<Unit> unit = s.loadUnits(player1.getSelectedUnits());
                System.out.println("Loaded units: " + unit.size());
            }
        }
        
        //셔틀과 그리핀을 선택하고 이동한다
        //선택한 그룹중 셔틀에 탑승하지 못한 나머지 유닛이 셔틀과 그리핀이다.
        player1.moveUnits(new Point(10, 10));

        ArrayList<Unit> unLoadedUnit = new ArrayList<Unit>();
        for (Unit u : player1.getSelectedUnits()){
            if(u instanceof Shuttle){
                Shuttle s = (Shuttle) u;
                unLoadedUnit.addAll(s.unLoadUnits());
            }
        
        }
        //System.out.println("select units: " + player1.getSelectedUnits().size());
        player1.AddSelectUnits(unLoadedUnit);
        System.out.println("select units: " + player1.getSelectedUnits().size());

        // player2가 유닛 생산 기지를 만든다.
        player2.createUnitStore(StoreType.BARRACK);
        player2.createUnitStore(StoreType.AIRPORT); 
        player2.createUnitStore(StoreType.GRIFFINCHAMBER);

        ArrayList<Unit> player2_Knights = player2.CreateUnits(UnitType.KNIGHT, 3, new Point(10, 10));
        ArrayList<Unit> player2_Archers = player2.CreateUnits(UnitType.ARCHER, 3, new Point(10, 10));
        ArrayList<Unit> player2_Griffins = player2.CreateUnits(UnitType.GRIFFIN, 1, new Point(10, 10));
        ArrayList<Unit> player2_CreatedUnits = new ArrayList<Unit>();
        player2_CreatedUnits.addAll(player2_Knights);
        player2_CreatedUnits.addAll(player2_Archers);
        player2_CreatedUnits.addAll(player2_Griffins);

        player1.attackUnits(player2_CreatedUnits);

        
        
        
        
        //player1.selectUnits()


    }
}
