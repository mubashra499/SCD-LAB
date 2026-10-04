package com.hitms.lms;

/**
 * Represents a library member.
 */
public final class Member {

    private final String id;
    private final String name;

    /**
     * Creates a member.
     *
     * @param id   the member identifier
     * @param name the member name
     */
    public Member(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the member identifier.
     *
     * @return the identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the member name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}
