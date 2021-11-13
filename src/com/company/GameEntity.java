package com.company;

public class GameEntity {
    private String name;
    private String paver;
    private int health;
    private int damege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaver() {
        return paver;
    }

    public void setPaver(String paver) {
        this.paver = paver;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        this.damege = damege;
    }
}
