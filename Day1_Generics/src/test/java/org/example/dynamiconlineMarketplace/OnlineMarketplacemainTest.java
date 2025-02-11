package org.example.dynamiconlineMarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountUtilTest {
    @Test
    void testApplyDiscount() {
        Book book = new Book("The Alchemist", 20.0, new BookCategory("Fiction"));
        DiscountUtil.applyDiscount(book, 10);
        assertEquals(18.0, book.getPrice());  // 10% off 20.0 = 18.0

        Clothing clothing = new Clothing("T-Shirt", 15.0, new ClothingCategory("Casual"));
        DiscountUtil.applyDiscount(clothing, 20);
        assertEquals(12.0, clothing.getPrice());  // 20% off 15.0 = 12.0

        Gadget gadget = new Gadget("Smartphone", 500.0, new GadgetCategory("Electronics"));
        DiscountUtil.applyDiscount(gadget, 5);
        assertEquals(475.0, gadget.getPrice());  // 5% off 500.0 = 475.0
    }
}
