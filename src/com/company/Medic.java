package com.company;

public class Medic extends Hero {


    @Override
    public void applySuperAbility(String superAbilityType) {
        setDamage(15);
        setHealth(250);
        setSuperAbilityType(" Medic применил свою суперспособность!");
        System.out.println("HP: " + getHealth() + "| DAMAGE:" + getDamage() + "|" + getSuperAbilityType());

    }
}
