package DungeonEntity;

public class Player extends DungeonEntity{
    private int gold;
    private int xp;
    private int armor = 0;
    private final static int BASE_HP = 20;
    private final static int BASE_ATK = 1;
    protected Player(int health, int attack, String name, int gold, int xp, int armor) {
        super(health, attack, name);
        this.gold = gold;
        this.xp = xp;
        this.armor = armor;
    }
    // Base stats player constructor
    public Player(String name) {
        super(BASE_HP, BASE_ATK, name);
    }


    @Override
    public String attackEntity(DungeonEntity dungeonEntity) {
        if(dungeonEntity.getClass().equals(Monster.class)){
            int attackChance = attackChance();
            if(attackChance > 10 && attackChance < 20){
                // landAttack
                dungeonEntity.getAttacked(this);
                return "Dice rolled with a value of " + attackChance + ". You landed your attack!";
            }else return "Dice rolled with a value of " + attackChance + ". Your attack missed!";
        }else {
            return "Target has to be a monster";
        }
    }

    @Override
    public void getAttacked(DungeonEntity dungeonEntity) {
        if(dungeonEntity.attack >= (health+armor)){
            // throw GameOverException
            this.alive = false;
        }else {
            int attackValue = armor >= attack ? 0 : attack;
            this.health -= attackValue;
        }
    }
}
