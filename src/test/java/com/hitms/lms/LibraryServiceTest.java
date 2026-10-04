package com.hitms.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LibraryServiceTest {

    @Test
    void issueBookReducesCopiesByOne() throws BookUnavailableException {
        assertEquals(2, LibraryService.issueBook(3, "Clean Code"));
    }

    @Test
    void issueBookThrowsWhenNoCopiesAvailable() {
        BookUnavailableException ex = assertThrows(
                BookUnavailableException.class,
                () -> LibraryService.issueBook(0, "Clean Code"));
        assertEquals("'Clean Code' has no copies available.", ex.getMessage());
    }
}
