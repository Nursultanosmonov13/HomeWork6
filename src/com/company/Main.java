package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon("Пистолет", "Mакаров");

        Boss boss = new Boss();
        boss.setHealthOfBoss(700);
        boss.setDamageBoss(50);
        boss.setProtectionTypeBoss("Тор");

        boss.setWeaponBoss(weapon);
        System.out.println("Здоровье босса: " + boss.getHealthOfBoss() + ", урон босса:" + boss.getDamageBoss() + ", тип защиты босса:" + boss.getProtectionTypeBoss() +
                        ", тип оружия Босса:" + boss.getWeaponBoss().getWeaponType() + ", наименование оружия Босса:" + boss.getWeaponBoss().getWeaponNames());


    }
}
