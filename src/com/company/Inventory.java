package com.company;

import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Integer> inventoryMap;

    public boolean getFromInventory(Integer productId, Integer amount)
    {
        Integer warehouseStockLevel = inventoryMap.get(productId);
        if(warehouseStockLevel >= amount) {
            inventoryMap.put(productId, warehouseStockLevel - amount);
            return true;
        } else {
            return false;
        }
    }

    public void putBackToInventory(Integer productId, Integer amount)
    {
        Integer warehouseStockLevel = inventoryMap.get(productId);
        warehouseStockLevel += amount;
        inventoryMap.put(productId, warehouseStockLevel);
    }
}
