package com.company;

public class Boss extends GameEntity {

    private Weapon weaponBoss;
    private String protectionTypeBoss; // тип защиты босса

    public String getProtectionTypeBoss() {
        return protectionTypeBoss;
    }

    public void setProtectionTypeBoss(String protectionTypeBoss) {
        this.protectionTypeBoss = protectionTypeBoss;
    }

    public Weapon getWeaponBoss() {
        return weaponBoss;
    }

    public void setWeaponBoss(Weapon weaponBoss) {
        this.weaponBoss = weaponBoss;
    }
    public String printInfo(){
        Weapon weapon = new Weapon("Пистолет", "Mакаров");
        Boss boss = new Boss();
        boss.setHealthOfBoss(700);
        boss.setDamageBoss(50);
        boss.setProtectionTypeBoss("Тор");
        boss.setWeaponBoss(weapon);
        return("Здоровье босса: " + boss.getHealthOfBoss() + ", урон босса:" + boss.getDamageBoss() + ", тип защиты босса:" + boss.getProtectionTypeBoss() +
                ", тип оружия Босса:" + boss.getWeaponBoss().getWeaponType() + ", наименование оружия Босса:" + boss.getWeaponBoss().getWeaponNames());
    }
}
