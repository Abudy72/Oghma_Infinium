package DungeonMap;

public abstract class DungeonMapPoint {
    private boolean isInspected = false;
    private DungeonMapPoint leftPath;
    private DungeonMapPoint rightPath;
    private DungeonMapPoint forwardPath;
    private DungeonMapPoint backwardPath;

    public abstract void spawnMonster();
    public abstract void spawnEvent();
    public abstract void spawnLoot();
    public abstract void inspect();

}
