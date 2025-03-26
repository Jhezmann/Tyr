package org.tyr.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.tyr.entity.Inventory;

public class InventoryService {
    @Cacheable(value = "inventory", key = "#storeId")
    public Inventory getInventoryByStoreId(int storeId) {
        // Method implementation
        return null;
    }

    @CachePut(value = "inventory", key = "#inventory.id")
    public Inventory updateInventory(Inventory inventory) {
        // Method implementation
        return inventory;
    }

    @CacheEvict(value = "inventory", key = "#id")
    public void deleteUser(int id) {
        // Method implementation
    }
}
