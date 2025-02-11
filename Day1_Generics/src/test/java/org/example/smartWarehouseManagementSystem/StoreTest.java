package org.example.smartWarehouseManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class StoreTest {

    @Test
    void testAddItem() {
        Store<Electronics> store = new Store<>();
        Electronics item = new Electronics("Laptop");
        store.addItem(item);
        assertTrue(store.getItems().contains(item), "Item should be added to store");
    }

    @Test
    void testRemoveItem() {
        Store<Furniture> store = new Store<>();
        Furniture item = new Furniture("Table");
        store.addItem(item);
        store.removeItem(item);
        assertFalse(store.getItems().contains(item), "Item should be removed from store");
    }
}
