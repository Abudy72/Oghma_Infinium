package DungeonInventoryModule;

import java.util.HashMap;

public class Inventory implements IInventory{
    private final HashMap<String,InventoryItem> itemList = new HashMap<>();

    @Override
    public void addItem(InventoryItem inventoryItem) {
        if(itemList.get(inventoryItem.getItemName()) == null){
            itemList.put(inventoryItem.getItemName(),inventoryItem);
        }else {
            inventoryItem.increaseCount();
        }
    }

    @Override
    public void removeItem(InventoryItem inventoryItem) {
        itemList.remove(inventoryItem.getItemName());
    }
}
