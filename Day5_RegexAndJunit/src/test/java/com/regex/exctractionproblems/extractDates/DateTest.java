package com.regex.exctractionproblems.extractDates;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class DateTest {

    @Test
    void testExtractDates() {
        assertEquals(Arrays.asList("12/05/2023", "15/08/2024", "29/02/2020"),
                Date.extractDates("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."));

        assertEquals(Arrays.asList("01/01/2000"),
                Date.extractDates("New Year started on 01/01/2000."));

        assertEquals(Collections.emptyList(),
                Date.extractDates("There are no valid dates here."));
    }

    @Test
    void testInvalidDates() {
        assertEquals(Collections.emptyList(),
                Date.extractDates("This date 32/01/2023 is invalid."));

        assertEquals(Collections.emptyList(),
                Date.extractDates("Invalid format: 2023/12/05"));
    }
}
