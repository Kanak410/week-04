package org.example.smartWarehouseManagementSystem;

public class Main {
    public static void main(String[] args) {
        Store<Electronics> electronicsStorage = new Store<>();
        electronicsStorage.addItem(new Electronics("PC"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Store<Groceries> groceriesStorage = new Store<>();
        groceriesStorage.addItem(new Groceries("orange"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Store<Furniture> furnitureStorage = new Store<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items using wildcard method
        System.out.println("Electronics Storage:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
