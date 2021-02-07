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
        return ":";
    }
}
