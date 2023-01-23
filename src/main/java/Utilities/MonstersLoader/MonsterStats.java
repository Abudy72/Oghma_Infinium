package Utilities.MonstersLoader;



import java.util.List;
import java.util.stream.Collectors;

import static Utilities.MonstersLoader.LoadMonstersJson.getAllMonsters;

public class MonsterStats {
    private final String name;
    private final String gif;
    private final int attack;
    private final int hp;
    private final int level;

    private MonsterStats(String name, String gif, int attack, int hp, int level) {
        this.name = name;
        this.gif = gif;
        this.attack = attack;
        this.hp = hp;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getGif() {
        return gif;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }


    public static List<MonsterStats> getMonstersByLevel(int level){
        List<MonsterStats> monsterStatsList = getAllMonsters();
        return monsterStatsList.stream().
                filter(monsterStats -> monsterStats.level == level).collect(Collectors.toList());
    }
}
