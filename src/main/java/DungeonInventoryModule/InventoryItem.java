package DungeonInventoryModule;

public class InventoryItem {
    private final String itemName;
    private final int additionalHP;
    private final int additionalAtk;
    private final int additionalArmor;
    private int itemCount = 0;

    public InventoryItem(String itemName, int additionalHP, int additionalAtk, int additionalArmor, int itemCount) {
        this.itemName = itemName;
        this.additionalHP = additionalHP;
        this.additionalAtk = additionalAtk;
        this.additionalArmor = additionalArmor;
        this.itemCount = itemCount;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAdditionalHP() {
        return additionalHP;
    }

    public int getAdditionalAtk() {
        return additionalAtk;
    }

    public int getAdditionalArmor() {
        return additionalArmor;
    }

    protected void increaseCount(){
        this.itemCount += 1;
    }
}
