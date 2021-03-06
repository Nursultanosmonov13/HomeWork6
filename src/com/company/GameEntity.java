package com.company;

public class GameEntity {
    private int healthOfHeroes; //здоровье героев
    private int heroDamage; //здоровье босса
    private String superpower; // Супер сила героев
    private int healthOfBoss;   //здоровье босса
    private int damageBoss;     // урон босса
    //private String protectionTypeBoss; // тип защиты босса

    public GameEntity(){}

    public int getDamageBoss() {
        return damageBoss;
    }

    public int getHealthOfHeroes() {
        return healthOfHeroes;
    }

    public void setHealthOfHeroes(int healthOfHeroes) {
        this.healthOfHeroes = healthOfHeroes;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getHealthOfBoss() {
        return healthOfBoss;
    }

    public void setHealthOfBoss(int healthOfBoss) {
        this.healthOfBoss = healthOfBoss;
    }


    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }


}
