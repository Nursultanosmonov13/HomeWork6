package com.company;

public class Weapon {
    private String weaponType;
    private String weaponNames;

    public Weapon() {
    }

    public Weapon(String weaponType, String weaponNames) {
        this.weaponType = weaponType;
        this.weaponNames = weaponNames;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponNames() {
        return weaponNames;
    }

    public void setWeaponNames(String weaponNames) {
        this.weaponNames = weaponNames;
    }
}
