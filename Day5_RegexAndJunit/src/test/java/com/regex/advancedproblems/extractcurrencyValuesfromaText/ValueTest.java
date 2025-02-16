package com.regex.advancedproblems.extractcurrencyValuesfromaText;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ValueTest {

    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> expectedValues = List.of("$45.99", "10.50");
        assertEquals(expectedValues, Value.extractCurrencyValues(text));
    }

    @Test
    void testNoCurrencyValues() {
        String text = "There are no currency values here.";
        assertTrue(Value.extractCurrencyValues(text).isEmpty());
    }

    @Test
    void testMultipleCurrencyFormats() {
        String text = "$100, 200.50, and $5 are valid values.";
        List<String> expectedValues = List.of("$100", "200.50", "$5");
        assertEquals(expectedValues, Value.extractCurrencyValues(text));
    }

    
}
