package com.company.players;

import com.company.AbilityType;
import com.company.boss.Boss;

import java.util.Random;

public class Medic extends Hero{

    public Medic(int health, int damage) {
        super(health, damage, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes){
            int randomHealth = new Random().nextInt(30);
            hero.setHealth(hero.getHealth() + randomHealth);
            System.out.println("Medic healed " + hero.getClass().getSimpleName() + ": " + randomHealth);
            break;
        }
    }
}
