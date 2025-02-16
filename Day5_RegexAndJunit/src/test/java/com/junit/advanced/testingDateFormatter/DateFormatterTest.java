package com.junit.advanced.testingDateFormatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDateFormatting() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"), "2025-02-15 should be formatted as 15-02-2025");
        assertEquals("31-12-1999", DateFormatter.formatDate("1999-12-31"), "1999-12-31 should be formatted as 31-12-1999");
        assertEquals("27-07-2024", DateFormatter.formatDate("2024-07-27"), "2024-07-27 should be formatted as 27-07-2024");
    }

    @Test
    void testInvalidDateFormatting() {
        assertEquals("Invalid Date", DateFormatter.formatDate("invalid-date"), "Invalid input should return 'Invalid Date'");
        assertEquals("Invalid Date", DateFormatter.formatDate("2024/07/27"), "Invalid format should return 'Invalid Date'");
        assertEquals("Invalid Date", DateFormatter.formatDate("15-02-2025"), "Wrong format (dd-MM-yyyy) should return 'Invalid Date'");
    }


}