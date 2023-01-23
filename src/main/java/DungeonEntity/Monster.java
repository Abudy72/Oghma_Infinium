package DungeonEntity;

import Utilities.MonstersLoader.MonsterStats;

import static Utilities.MonstersLoader.MonsterStats.getMonstersByLevel;


public class Monster extends DungeonEntity{
    private final MonsterStats stats;
    public Monster(int level) {
        this.stats = getMonstersByLevel(level).get(0); // Hard coded to pick first enemy with same level as @Code Level.
        this.health = stats.getHp();
        this.attack = stats.getAttack();
        this.name = stats.getName();
    }

    @Override
    public String attackEntity(DungeonEntity dungeonEntity) {
        int attackChance = this.attackChance();
        if(attackChance > 0 && attackChance < 10){
            // land Attack
            dungeonEntity.getAttacked(this);
            return "Dice rolled with a value of " + attackChance + ". " + this.getName() + " attack landed!";
        }else return "Dice rolled with a value of " + attackChance + "." + this.getName() + " attack missed!";
    }

    @Override
    public void getAttacked(DungeonEntity dungeonEntity) {
        this.health -= dungeonEntity.getAttack();
        if(this.health <= 0) this.alive = false;
    }
}
