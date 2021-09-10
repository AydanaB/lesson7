package com.company.players;

import com.company.AbilityType;
import com.company.IAbility;
import com.company.boss.Boss;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        boss.setHealth(boss.getHealth() - boss.getDamage());
        System.out.println("Warrior saved and reverted damage:" + boss.getDamage());
    }
}
