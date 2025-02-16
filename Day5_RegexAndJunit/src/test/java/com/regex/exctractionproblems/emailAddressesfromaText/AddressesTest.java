package com.regex.exctractionproblems.emailAddressesfromaText;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class AddressesTest {

    @Test
    void testExtractEmails() {
        assertEquals(Arrays.asList("support@example.com", "info@company.org"),
                Addresses.extractEmails("Contact us at support@example.com and info@company.org for more details."));

        assertEquals(Arrays.asList("user123@gmail.com", "admin@domain.net"),
                Addresses.extractEmails("Emails: user123@gmail.com, admin@domain.net"));

        assertEquals(Collections.emptyList(),
                Addresses.extractEmails("No emails in this text."));
    }

    @Test
    void testEmailsWithSpecialCharacters() {
        assertEquals(Arrays.asList("user.name+tag+sorting@example.com"),
                Addresses.extractEmails("Reach me at user.name+tag+sorting@example.com"));
    }
}
