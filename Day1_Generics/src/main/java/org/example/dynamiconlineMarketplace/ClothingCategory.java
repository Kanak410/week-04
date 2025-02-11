package org.example.dynamiconlineMarketplace;

public class ClothingCategory {
    private String type;

    public ClothingCategory(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
class Clothing extends Product<ClothingCategory> {
    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price, category);
    }
}
