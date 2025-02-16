package com.junit.basic.BeforeEachandAfterEachAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    private DatabaseConnection databaseConnection;

    @BeforeEach
    void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @AfterEach
    void tearDown() {
        databaseConnection.disconnect();
    }

    @Test
    void testDatabaseConnectionIsActive() {
        assertTrue(databaseConnection.isConnected(), "Database should be connected.");
    }

    @Test
    void testDatabaseDisconnection() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected(), "Database should be disconnected.");
    }
}