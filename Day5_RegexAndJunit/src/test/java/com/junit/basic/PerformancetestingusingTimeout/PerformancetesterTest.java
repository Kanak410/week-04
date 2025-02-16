package com.junit.basic.PerformancetestingusingTimeout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

public class PerformancetesterTest {

    @Test
    void testLongRunningTaskWithinTimeout() {
        assertTimeout(Duration.ofSeconds(4), () -> {
            assertEquals("Task Completed", Performancetester.longRunningTask());
        }, "Method should complete within 4 seconds.");
    }

    @Test
    @Timeout(4) // Fail if execution takes longer than 4 seconds
    void testWithTimeoutAnnotation() {
        assertEquals("Task Completed", Performancetester.longRunningTask());
    }
}