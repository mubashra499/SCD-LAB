package com.hitms.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class MemberLookupTest {

    private final List<Member> members = List.of(
            new Member("M001", "Ayesha"), new Member("M002", "Bilal"));

    @Test
    void findsExistingMember() {
        Optional<Member> found = LibraryService.findMemberById(members, "M002");
        assertTrue(found.isPresent());
        assertEquals("Bilal", found.get().getName());
    }

    @Test
    void returnsEmptyForUnknownMember() {
        assertTrue(LibraryService.findMemberById(members, "M999").isEmpty());
    }

    @Test
    void returnsEmptyForNullArguments() {
        assertTrue(LibraryService.findMemberById(null, "M001").isEmpty());
        assertTrue(LibraryService.findMemberById(members, null).isEmpty());
    }
}
