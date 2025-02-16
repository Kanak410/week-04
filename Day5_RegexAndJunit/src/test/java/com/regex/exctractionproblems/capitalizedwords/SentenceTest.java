package com.regex.exctractionproblems.capitalizedwords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class SentenceTest {

    @Test
    void testCapitalizedWords() {
        assertEquals(Arrays.asList("The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"),
                Sentence.capital("The Eiffel Tower is in Paris and the Statue of Liberty is in New York."));

        assertEquals(Arrays.asList("Hello", "World"),
                Sentence.capital("Hello World"));

        assertEquals(Collections.emptyList(),
                Sentence.capital("this is a lowercase sentence."));
    }

    @Test
    void testSingleCapitalizedWords() {
        assertEquals(Arrays.asList("Java"), Sentence.capital("Java"));
        assertEquals(Arrays.asList("Python", "Developer"), Sentence.capital("Python Developer"));
    }
}