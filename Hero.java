package com.company.players;

import com.company.AbilityType;
import com.company.GameEntity;
import com.company.IAbility;

public abstract class Hero extends GameEntity implements IAbility {

    private AbilityType ability;

    public Hero(int health, int damage, AbilityType ability) {
        super(health, damage);
        this.ability = ability;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }
}
