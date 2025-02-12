package org.example.listInterface.rotateElementsinaList;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateTest {

    @Test
    void testRotateByTwo() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);

        Rotate.rotate(list, 2); // Rotate by 2 positions

        assertEquals(expected, list);
    }

    @Test
    void testRotateByZero() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50);

        Rotate.rotate(list, 0); // Rotate by 0 (should remain unchanged)

        assertEquals(expected, list);
    }

    @Test
    void testRotateBySize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50);

        Rotate.rotate(list, list.size()); // Rotate by list size (should remain unchanged)

        assertEquals(expected, list);
    }


}
