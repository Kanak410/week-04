package org.example.listInterface.findFrequencyofelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyTest {

    @Test
    void testFrequency() {
        // Arrange: Set up the test data
        ArrayList<String> ls = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        // Act: Call the method under test
        HashMap<String, Integer> actual = Frequency.fre(ls.toArray(new String[0]));  // Convert list to array

        // Assert: Compare the expected and actual results
        assertEquals(expected, actual);
    }
}
