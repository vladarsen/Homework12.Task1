package com.vladarsenjtev.model;

public class Tank extends Soldier {

    public Tank(int speed, int damage) {
        super(speed, damage);
    }

    public Tank(int speed, int damage, Experience experience) {
        super(speed, damage, experience);
    }


    public void reload() {
        System.out.println("Перезаряжаюсь, прикрой меня!");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "speed=" + speed +
                ", damage=" + damage +
                ", experience=" + experience +
                '}';
    }
}
