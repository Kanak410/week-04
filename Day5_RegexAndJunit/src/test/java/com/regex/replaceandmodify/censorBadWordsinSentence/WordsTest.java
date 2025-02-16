package com.regex.replaceandmodify.censorBadWordsinSentence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class WordsTest {

    @Test
    void testCensorBadWords() {
        List<String> badWords = Arrays.asList("damn", "stupid");
        assertEquals("This is a **** bad example with some ****** words.",
                Words.censorBadWords("This is a damn bad example with some stupid words.", badWords));

        assertEquals("No bad words here.",
                Words.censorBadWords("No bad words here.", badWords));
    }

    @Test
    void testCensorCaseInsensitive() {
        List<String> badWords = Arrays.asList("badword");
        assertEquals("This is a ******* example.",
                Words.censorBadWords("This is a BADWORD example.", badWords));
    }
}
