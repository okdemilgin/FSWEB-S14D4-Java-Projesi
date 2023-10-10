package com.workintech.store.rpg;

public class Spider extends Monster implements Poisonable{

    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        System.out.println(poison());
        return getDamage() + poison();
    }

    @Override
    public double poison() {
        //Monster.getRandomizeDamage(level)
        return getDamage() * 0.3;
    }
}