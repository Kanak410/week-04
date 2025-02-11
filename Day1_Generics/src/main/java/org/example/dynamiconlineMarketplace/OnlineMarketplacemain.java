package org.example.dynamiconlineMarketplace;

public class OnlineMarketplacemain {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", 20.0, new BookCategory("Fiction"));
        Clothing clothing = new Clothing("T-Shirt", 15.0, new ClothingCategory("Casual"));
        Gadget gadget = new Gadget("Smartphone", 500.0, new GadgetCategory("Electronics"));

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(clothing, 20);
        DiscountUtil.applyDiscount(gadget, 5);
    }
}
