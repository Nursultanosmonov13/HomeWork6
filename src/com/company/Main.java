package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon("Пистолет", "Mакаров");

        Boss boss = new Boss();
        boss.setWeaponBoss(weapon);
        boss.setHealthOfBoss(700);
        boss.setDamageBoss(50);
        boss.setProtectionTypeBoss("Тор");
        Skeleton skeleton= new Skeleton();
        System.out.println(skeleton.printInfo());
        //System.out.println(boss.printInfo());


    }
}
