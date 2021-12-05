package com.vladarsenjtev.model;

public class Fence extends Structures {
    public Fence(int height, boolean immortal, String color) {
        super(height, immortal, color);
    }

    public enum TypeFence {
        CAST_IRON, PANEL, EKO
    }

    private TypeFence typeFence;

    public Fence(int height, boolean immortal, String color, TypeFence typeFence) {
        super(height, immortal, color);
        this.typeFence = typeFence;
    }

    public TypeFence getTypeFence() {
        return typeFence;
    }

    @Override
    public String toString() {
        return "Fence{" +
                "height=" + height +
                ", immortal=" + immortal +
                ", color='" + color + '\'' +
                ", typeFence=" + typeFence +
                '}';
    }
}