package com.hitms.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class LibraryUtilsTest {

    @Test
    void formatTitleProducesTitleCase() {
        assertEquals("The Great Gatsby",
                LibraryUtils.formatTitle(" the great gatsby "));
    }

    @Test
    void daysBetweenReturnsWholeDays() {
        assertEquals(14, LibraryUtils.daysBetween(
                LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 15)));
    }
}
