package com.vladarsenjtev.model;

public class Structures {
    protected int height;
    protected boolean immortal;
    protected String color;

    public int getHeight() {
        return height;
    }

    public boolean isStrength() {
        return immortal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Structures(int height, boolean strength, String color) {
        this.height = height;
        this.immortal = strength;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Structures{" +
                "height=" + height +
                ", immortal=" + immortal +
                ", color='" + color + '\'' +
                '}';
    }
}
