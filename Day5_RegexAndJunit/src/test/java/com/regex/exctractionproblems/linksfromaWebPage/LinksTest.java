package com.regex.exctractionproblems.linksfromaWebPage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class LinksTest {

    @Test
    void testValidUrls() {
        assertEquals(Arrays.asList("https://www.google.com", "http://example.org"),
                Links.getUrl("Visit https://www.google.com and http://example.org for more info."));

        assertEquals(Arrays.asList("https://openai.com"),
                Links.getUrl("Check out https://openai.com for AI research."));
    }

    @Test
    void testInvalidUrls() {
        assertEquals(Collections.emptyList(),
                Links.getUrl("No valid links here, just text."));

        assertEquals(Collections.emptyList(),
                Links.getUrl("Visit www.example without protocol."));
    }
}
