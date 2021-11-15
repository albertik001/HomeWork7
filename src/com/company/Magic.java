package com.company;

public class Magic extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        setDamage(25);
        setHealth(300);
        setSuperAbilityType(" Magic применил свою суперспособность!");
        System.out.println("HP: " + getHealth() + "| DAMAGE:" + getDamage() + "|" + getSuperAbilityType());

    }
}

