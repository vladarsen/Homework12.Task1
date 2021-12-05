package com.vladarsenjtev.model;

public class Army {
    protected int speed;
    protected int damage;


    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }


    public Army(int speed, int damage) {
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Army{" +
                "speed=" + speed +
                ", damage=" + damage +
                '}';
    }
}
