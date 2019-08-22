package com.company;

public class Player {
    private String name;
    Player p1;
    Player p2;
    Player p3;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
