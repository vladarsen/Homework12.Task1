package com.vladarsenjtev.model;

public class Soldier extends Army {
    public Soldier(int speed, int damage) {
        super(speed, damage);
    }

    public enum Experience {
        ROOKIE, EXPERIENCED, VETERAN

    }

    protected Experience experience;

    public Experience getExperience() {
        return experience;
    }

    public void move() {
        this.speed += 5;
    }

    public void fire() {
        this.damage += 20;
    }

    public Soldier(int speed, int damage, Experience experience) {
        super(speed, damage);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "speed=" + speed +
                ", damage=" + damage +
                ", experience=" + experience +
                '}';
    }
}
