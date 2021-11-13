package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setHealth(6000);
        boss1.setDamege(4000);
        boss1.setName("kageayma");
        boss1.setPaver("heal");
        boss1.weapon.setName("fire boll ");

        System.out.println(boss1.getName()+boss1.getDamege()+ boss1.getHealth()+boss1.getPaver());
    }
}
