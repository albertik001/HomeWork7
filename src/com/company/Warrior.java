package com.company;

public class Warrior extends Hero {

    @Override
    public void applySuperAbility(String superAbilityType) {
        setDamage(35);
        setHealth(250);
        setSuperAbilityType(" Warrior применил свою суперспособность!");
        System.out.println("HP: " + getHealth() + "| DAMAGE:" + getDamage() + "|" + getSuperAbilityType());

    }
}
