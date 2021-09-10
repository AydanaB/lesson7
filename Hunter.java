package com.company.players;

import com.company.AbilityType;
import com.company.boss.Boss;

import java.util.Random;

public class Hunter extends Hero{

    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        int randomDamage = new Random().nextInt(50);
        boss.setHealth(getHealth() - randomDamage);
        System.out.println("Hunter use critical damage ability: " + randomDamage);
    }
}
