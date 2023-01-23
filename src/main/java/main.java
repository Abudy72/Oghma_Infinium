import DungeonEntity.Monster;
import DungeonEntity.Player;

public class main {
    public static void main(String[] args) {
        Monster m = new Monster(17);
        Player p = new Player("RoYal");

        while(m.alive && p.alive){
            System.out.println(p.attackEntity(m));
            System.out.println(m);
            System.out.println(m.attackEntity(p));
            System.out.println(p);
        }

        System.out.println(p.alive);
        System.out.println(m.alive);
    }
}
