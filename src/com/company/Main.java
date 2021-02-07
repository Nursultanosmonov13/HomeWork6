package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon("Пистолет", "Mакаров");

        Boss boss = new Boss();
        boss.setWeaponBoss(weapon);
        System.out.println("Тип оружия Босса: " + boss.getWeaponBoss().getWeaponType() + ", наименование оружия Босса: " + boss.getWeaponBoss().getWeaponNames());


    }
}
