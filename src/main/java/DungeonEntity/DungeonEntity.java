package DungeonEntity;

import java.util.Random;

public abstract class DungeonEntity{
    int health;
    int attack;
    String name;
    public boolean alive = true;

    static int MAX_LUCK_VALUE = 20;
    static int MIN_LUCK_VALUE = 0;

     public int attackChance(){
         Random random = new Random();
         return random.nextInt(MAX_LUCK_VALUE - MIN_LUCK_VALUE + 1) + MIN_LUCK_VALUE;
     }

     public abstract String attackEntity(DungeonEntity dungeonEntity);

     public abstract void getAttacked(DungeonEntity dungeonEntity);

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public DungeonEntity(int health, int attack, String name) {
        this.health = health;
        this.attack = attack;
        this.name = name;
    }

    public DungeonEntity() {
    }

    @Override
    public String toString() {
        return "DungeonEntity{" +
                "health=" + health +
                ", attack=" + attack +
                ", name='" + name + '\'' +
                ", alive=" + alive +
                '}';
    }
}
