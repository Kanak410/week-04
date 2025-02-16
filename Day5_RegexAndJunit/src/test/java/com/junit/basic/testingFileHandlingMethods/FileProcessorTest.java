package com.junit.basic.testingFileHandlingMethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    private final String testFilename = "testfile.txt";
    private final String testContent = "Hello, File Handling in Java!";

    @BeforeEach
    void setUp() throws IOException {
        // Write content before tests
        FileProcessor.writeToFile(testFilename, testContent);
    }

    @Test
    void testWriteToFile() throws IOException {
        // Read content and verify
        String content = FileProcessor.readFromFile(testFilename);
        assertEquals(testContent, content, "File content should match written content.");
    }

    @Test
    void testReadFromFile() throws IOException {
        // Read from file and verify it's not empty
        String content = FileProcessor.readFromFile(testFilename);
        assertNotNull(content, "File content should not be null.");
        assertFalse(content.isEmpty(), "File content should not be empty.");
    }

    @AfterEach
    void tearDown() {
        // Delete test file after tests
        File file = new File(testFilename);
        if (file.exists()) {
            file.delete();
        }
    }
}