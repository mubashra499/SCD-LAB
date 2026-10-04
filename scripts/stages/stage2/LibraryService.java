package com.hitms.lms;

import java.util.List;
import java.util.Optional;

public class LibraryService {

    public static int issueBook(int availableCopies, String title)
            throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException(
                    "'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    public static Optional<Member> findMemberById(
            List<Member> members, String memberId) {
        if (members == null || memberId == null) {
            return Optional.empty();
        }
        for (Member member : members) {
            if (memberId.equals(member.getId())) {
                return Optional.of(member);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Remaining copies: "
                    + issueBook(3, "Clean Code"));
            issueBook(0, "Clean Code");
        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
