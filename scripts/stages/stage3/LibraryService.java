package com.hitms.lms;

import java.util.List;
import java.util.Optional;

/**
 * Provides library operations such as issuing books.
 */
public class LibraryService {

    /**
     * Returns the copy count after issuing one copy of title.
     *
     * @param availableCopies the current number of available copies
     * @param title           the title of the book
     * @return the remaining copies after issuing one
     * @throws BookUnavailableException if availableCopies is 0
     */
    public static int issueBook(int availableCopies, String title)
            throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException(
                    "'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    /**
     * Finds a member by identifier.
     *
     * @param members  the registered members
     * @param memberId the identifier to look for
     * @return the matching member, or empty if none is found
     */
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

    /**
     * Runs a small demonstration of the library service.
     *
     * @param args command-line arguments
     */
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
