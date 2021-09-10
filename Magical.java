package com.company.players;

import com.company.AbilityType;
import com.company.boss.Boss;

import java.util.Random;

public class Magical extends Hero{

    public Magical(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            int randomBoostDamage = new Random().nextInt(10);
            hero.setDamage(hero.getDamage() + randomBoostDamage);
            System.out.println("Magical boosted " + hero.getClass().getSimpleName() + "damage: " + randomBoostDamage);
        }
    }
}
