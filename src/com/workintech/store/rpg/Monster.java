package com.workintech.store.rpg;

import java.util.Random;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public static double getRandomizeDamage(int level) {
        Random random = new Random();
        return random.nextInt(0, 1) * level;
    }

    public abstract double attack();
}