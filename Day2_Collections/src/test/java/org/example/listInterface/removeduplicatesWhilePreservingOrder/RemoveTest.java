package org.example.listInterface.removeduplicatesWhilePreservingOrder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveTest {

    @Test
    void testRemoveDuplicates() {
        // Arrange: Prepare input list
        List<Integer> input = List.of(3, 1, 2, 2, 3, 4);

        // Act: Call the method
        List<Integer> output = Remove.removeDuplicates(input);

        // Assert: Check the output
        List<Integer> expected = List.of(3, 1, 2, 4);
        assertEquals(expected, output);
    }

    @Test
    void testRemoveDuplicatesWithSingleElement() {
        // Arrange: Prepare input list with only one element
        List<Integer> input = List.of(5);

        // Act: Call the method
        List<Integer> output = Remove.removeDuplicates(input);

        // Assert: The result should be the same as input
        assertEquals(input, output);
    }

    @Test
    void testRemoveDuplicatesWithEmptyList() {
        // Arrange: Prepare an empty input list
        List<Integer> input = List.of();

        // Act: Call the method
        List<Integer> output = Remove.removeDuplicates(input);

        // Assert: The result should be an empty list
        assertEquals(input, output);
    }
}
