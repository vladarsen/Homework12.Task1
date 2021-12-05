package com.vladarsenjtev;

import com.vladarsenjtev.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static final int MAX_HEIGHT_FENCE = 20;
    public static final int MAX_HEIGHT_TOWER = 50;
    public static final int MAX_SPEED_TANK = 5;
    public static final int MAX_DAMAGE_TANK = 100;
    public static final int MAX_DAMAGE_SOLDIER = 30;
    public static final int MAX_SPEED_SOLDIER = 50;


    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Tower tower = new Tower(10, true, "Black", Tower.Type.STONE);
        Fence fence = new Fence(3, false, "Green", Fence.TypeFence.EKO);
        Soldier soldier = new Soldier(10, 5, Soldier.Experience.EXPERIENCED);
        Tank tank = new Tank(5, 50, Tank.Experience.VETERAN);

        System.out.println(tower);
        System.out.println(fence);
        System.out.println(soldier);
        soldier.move();
        soldier.fire();
        System.out.println();
        System.out.println(soldier);
        System.out.println();
        System.out.println(tank);
        tank.fire();
        System.out.println(tank);
        tank.reload();
        System.out.println();

        List<Army> army = generateArmy();
        System.out.println(army);
        List<Structures> structures = generateStructures();
        System.out.println(structures);
    }

    private static List<Structures> generateStructures() {
        List<Structures> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Tower tower = generateRandomTower();
            Fence fence = generateRandomFence();
            result.add(tower);
            result.add(fence);
        }
        return result;
    }

    private static Fence generateRandomFence() {
        int height = RANDOM.nextInt(MAX_HEIGHT_FENCE);
        boolean immortal = false;
        String color = "green";
        Fence.TypeFence type = Fence.TypeFence.EKO;
        return new Fence(height, immortal, color, type);
    }


    private static Tower generateRandomTower() {
        int height = RANDOM.nextInt(MAX_HEIGHT_TOWER);
        boolean immortal = true;
        String color = "black";
        Tower.Type type = Tower.Type.STONE;
        return new Tower(height, immortal, color, type);
    }

    public static List<Army> generateArmy() {
        List<Army> result = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Soldier soldier = generateRandomSoldier();
            Tank tank = generateRandomTank();
            result.add(soldier);
            result.add(tank);
        }
        return result;
    }

    private static Tank generateRandomTank() {
        int speed = RANDOM.nextInt(MAX_SPEED_TANK);
        int damage = RANDOM.nextInt(MAX_DAMAGE_TANK) + 50;
        Soldier.Experience experience = Soldier.Experience.VETERAN;
        return new Tank(speed, damage, experience);
    }

    private static Soldier generateRandomSoldier() {
        int speed = RANDOM.nextInt(MAX_SPEED_SOLDIER);
        int damage = RANDOM.nextInt(MAX_DAMAGE_SOLDIER);
        Soldier.Experience experience = Soldier.Experience.EXPERIENCED;
        return new Soldier(speed, damage, experience);
    }
}