package com.hitms.lms;

import java.time.LocalDate;

/**
 * Runs the Library Management System utility example.
 */
public final class Main {

    private Main() {
    }

    /**
     * Runs the example program.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        System.out.println(
                LibraryUtils.formatTitle(" the great gatsby "));

        System.out.println(
                LibraryUtils.daysBetween(
                        LocalDate.of(2026, 1, 1),
                        LocalDate.of(2026, 1, 15)));
    }
}
