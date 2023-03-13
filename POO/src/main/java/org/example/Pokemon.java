package org.example;

import java.util.List;

public class Pokemon {

    String name;

    Type type;
    double height;
    Rarity rarity;
    String region;

    List<String> abilities;
    CombatStats combatStats;
    Pokemon evolution;

    private enum Rarity {
        COMMON,
        UNCOMMON,
        RARE,
        LEGENDARY
    }
    public enum Type {
        FIRE,
        WATER,
        GRASS,
        ELECTRIC,
        ICE,
        PSYCHIC,
        DARK,
        DRAGON,
        FLYING,
        GROUND,
        ROCK,
        BUG,
        POISON,
        STEEL,
        FAIRY,
        NORMAL
    }

    public class CombatStats {
        int attack;
        int defense;
        int speed;
        int specialAttack;
        int specialDefense;
    }

    Pokemon(String name, Rarity rarity,String region, double height,
            Type type, double weight, List<String> abilities, CombatStats combatStats,
            Pokemon evolution) {
        this.name = name;
        this.rarity = rarity;
        this.region = region;
        this.type = type;
        this.height = height;
        this.abilities = abilities;
        this.combatStats = combatStats;
        this.evolution = evolution;
    }

    void atacar(){};
    void defender(){};
    void evoluir(){};
}
