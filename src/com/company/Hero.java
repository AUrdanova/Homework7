package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int Health;
    private int Damage;
    private String superAbilityType;
    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType() {
        this.superAbilityType = superAbilityType;
    }



}

