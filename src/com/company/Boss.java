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
        Weapon weapon = new Weapon();
        setWeaponBoss(weapon);
        return ("Здоровье босса: " + getHealthOfBoss() + ", урон босса:" + getDamageBoss() + ", тип защиты босса:" + getProtectionTypeBoss() +
                ", тип оружия Босса:" + getWeaponBoss().getWeaponType() + ", наименование оружия Босса:" + getWeaponBoss().getWeaponNames());
    }
}
