package com.workintech.store.rpg;

public class Troll extends Monster{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage();
    }
}