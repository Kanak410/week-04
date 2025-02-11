package org.example.smartWarehouseManagementSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseUtilsTest {

    @Test
    void testDisplayItems() {
        List<Groceries> groceries = List.of(new Groceries("Apple"), new Groceries("Milk"));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        WarehouseUtils.displayItems(groceries);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Groceries: Apple") && output.contains("Groceries: Milk"), "Output should contain correct item names");
    }
}

