package org.example.smartWarehouseManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
