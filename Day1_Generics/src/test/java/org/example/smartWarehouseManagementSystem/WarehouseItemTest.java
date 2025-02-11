package org.example.smartWarehouseManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarehouseItemTest {
    static class TestItem extends WarehouseItem {
        public TestItem(String name) {
            super(name);
        }
    }
    @Test
    void testGetName() {
        WarehouseItem item = new TestItem("Sample Item");
        assertEquals("Sample Item", item.getName(), "getName() should return correct name");
    }
    @Test
    void testToString() {
        WarehouseItem item = new TestItem("Sample Item");
        assertEquals("TestItem: Sample Item", item.toString(), "toString() should return correct format");
    }


}