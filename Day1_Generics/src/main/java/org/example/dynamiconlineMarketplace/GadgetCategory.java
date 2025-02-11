package org.example.dynamiconlineMarketplace;
class Gadget extends Product<GadgetCategory> {
    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price, category);
    }
}
public class GadgetCategory {
    private String technology;

    public GadgetCategory(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return technology;
    }
}
