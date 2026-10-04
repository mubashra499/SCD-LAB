package com.hitms.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class IssueBookValidationTest {

    @Test
    void rejectsNullTitle() {
        assertThrows(IllegalArgumentException.class,
                () -> LibraryService.issueBook(3, null));
    }

    @Test
    void rejectsBlankTitle() {
        assertThrows(IllegalArgumentException.class,
                () -> LibraryService.issueBook(3, "   "));
    }

    @Test
    void acceptsValidTitle() throws BookUnavailableException {
        assertEquals(1, LibraryService.issueBook(2, "Clean Code"));
    }
}
