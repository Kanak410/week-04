package com.regex.advancedproblems.validateaCreditCardNumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CardTest {

    @Test
    void testCheckVisaCard() {
        assertTrue(Card.checkVisaCard("4111111111111111"));
        assertFalse(Card.checkVisaCard("5111111111111111"));
        assertFalse(Card.checkVisaCard("411111111111111")); // Too short
    }

    @Test
    void testCheckMasterCard() {
        assertTrue(Card.checkMasterCard("5111111111111111"));
        assertFalse(Card.checkMasterCard("4111111111111111"));
        assertFalse(Card.checkMasterCard("511111111111111")); // Too short
    }

    @Test
    void testInvalidCards() {
        assertFalse(Card.checkVisaCard("1234567890123456"));
        assertFalse(Card.checkMasterCard("9876543210987654"));
    }
}
