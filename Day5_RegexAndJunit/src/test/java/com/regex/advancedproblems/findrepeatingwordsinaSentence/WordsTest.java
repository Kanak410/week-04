package com.regex.advancedproblems.findrepeatingwordsinaSentence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;

class WordsTest {

    @Test
    void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> expectedWords = Set.of("is", "repeated");
        assertEquals(expectedWords, Words.findRepeatingWords(text));
    }

    @Test
    void testNoRepeatingWords() {
        String text = "Each word is unique in this sentence.";
        assertTrue(Words.findRepeatingWords(text).isEmpty());
    }

    @Test
    void testCaseInsensitiveRepeats() {
        String text = "Hello hello WORLD world!";
        Set<String> expectedWords = Set.of("hello", "world");
        assertEquals(expectedWords, Words.findRepeatingWords(text));
    }

    @Test
    void testPunctuationHandling() {
        String text = "Yes, yes! No no, maybe maybe?";
        Set<String> expectedWords = Set.of("yes", "no", "maybe");
        assertEquals(expectedWords, Words.findRepeatingWords(text));
    }
}
