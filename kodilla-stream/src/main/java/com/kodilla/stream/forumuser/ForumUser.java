package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPostsPublished;



    public ForumUser(final int ID, final String userName, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int numberOfPostsPublished) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPostsPublished = numberOfPostsPublished;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPostsPublished() {
        return numberOfPostsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPostsPublished=" + numberOfPostsPublished +
                '}';
    }
}
