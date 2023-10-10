package com.workintech.store.rpg;

public interface Bleedable {
    int x = 5;
    double bleed();
    double bleed(int level);

    default void bleeder(){
        System.out.println("Bleeded");
    }

    private void bleed2(){

    }
}