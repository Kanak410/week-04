package com.regex.advancedproblems.extractProgrammingLanguageNamesfromaText;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ProgrammingTest {

    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> expectedLanguages = List.of("Java", "Python", "JavaScript", "Go");
        assertEquals(expectedLanguages, Programming.extractLanguages(text));
    }

    @Test
    void testNoLanguagesFound() {
        String text = "I enjoy painting and music.";
        assertTrue(Programming.extractLanguages(text).isEmpty());
    }



    @Test
    void testEmbeddedWords() {
        String text = "I love JavaScript but not JavaBeans.";
        List<String> expectedLanguages = List.of("JavaScript");
        assertEquals(expectedLanguages, Programming.extractLanguages(text));
    }
}
