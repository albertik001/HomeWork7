package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("1");

        }

    }
}
