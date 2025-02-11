package org.example.dynamiconlineMarketplace;

public class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
        System.out.println("Discount applied: " + product);
    }
}
