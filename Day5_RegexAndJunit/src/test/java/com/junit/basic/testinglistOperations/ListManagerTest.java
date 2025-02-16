package com.junit.basic.testinglistOperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private List<Integer> testList;

    @BeforeEach
    void setUp() {
        testList = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListManager.addElement(testList, 5);
        ListManager.addElement(testList, 10);
        assertEquals(2, ListManager.getSize(testList));
        assertTrue(testList.contains(5));
        assertTrue(testList.contains(10));
    }

    @Test
    void testRemoveElement() {
        ListManager.addElement(testList, 5);
        ListManager.addElement(testList, 10);
        ListManager.removeElement(testList, 5);
        assertEquals(1, ListManager.getSize(testList));
        assertFalse(testList.contains(5));
        assertTrue(testList.contains(10));
    }

    @Test
    void testGetSize() {
        assertEquals(0, ListManager.getSize(testList));
        ListManager.addElement(testList, 1);
        assertEquals(1, ListManager.getSize(testList));
    }

    @Test
    void testRemoveNonExistentElement() {
        ListManager.addElement(testList, 10);
        ListManager.removeElement(testList, 5); // 5 is not in the list
        assertEquals(1, ListManager.getSize(testList)); // Size should remain 1
        assertTrue(testList.contains(10));
    }
}