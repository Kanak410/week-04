package com.regex.replaceandmodify.replacemultipleSpaceswithaSinglespace;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReplaceTest {

    @Test
    void testRemoveExtraSpace() {
        assertEquals("This is an example with multiple spaces.",
                Replace.removeExtraSpace("This is an example  with  multiple  spaces."));

        assertEquals("Hello world!",
                Replace.removeExtraSpace("Hello    world!"));

        assertEquals("NoExtraSpacesHere",
                Replace.removeExtraSpace("NoExtraSpacesHere"));
    }
}