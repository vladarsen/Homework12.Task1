package com.vladarsenjtev.model;

public class Tower extends Structures {
    protected Type type;

    public enum Type {
        STONE, WOOD, METAL
    }

    public Tower(int height, boolean immortal, String color) {
        super(height, immortal, color);
    }

    public Type getType() {
        return type;
    }

    public Tower(int height, boolean immortal, String color, Type type) {
        super(height, immortal, color);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "height=" + height +
                ", immortal=" + immortal +
                ", color='" + color + '\'' +
                ", type=" + type +
                '}';
    }
}
