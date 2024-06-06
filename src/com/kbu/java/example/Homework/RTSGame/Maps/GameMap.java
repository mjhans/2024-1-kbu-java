package com.kbu.java.example.Homework.RTSGame.Maps;

import java.util.*;
import com.kbu.java.example.Homework.RTSGame.Play.Player;

public class GameMap {
    protected ArrayList<Player> players;
    protected MapType mapType;

    public GameMap(MapType mapType, Player ... players) {
        this.players = new ArrayList<Player>();
        this.mapType = mapType;
        this.players.addAll(Arrays.asList(players));
    }

    public ArrayList<Player> start() {
        return players;
    }
}
