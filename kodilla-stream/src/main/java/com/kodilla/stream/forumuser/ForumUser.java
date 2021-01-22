package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPostsPublished;



    public ForumUser(final int ID, final String userName, final char sex,
                     final int yearOfBirth, final int monthOfBirth, int dayOfBirth,
                     final int numberOfPostsPublished) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPostsPublished = numberOfPostsPublished;
    }
}
