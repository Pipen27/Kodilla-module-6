package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends PrototypeForLibrary <Library> {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theList : books) {
            Book clonedList = new Book(theList.getTitle(), theList.getAuthor(), theList.getPublicationDate());

            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {

        String s = "Library [" + name + "]\n";
        for (Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;

    }
}
