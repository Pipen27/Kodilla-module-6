package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //given

        Library library = new Library("library_set_1");

        Book book1 = new Book("Space Wars", "Emily Fuller", LocalDate.of(1999,5,1));

        library.getBooks().add(new Book("King Kong", "James Godney", LocalDate.of(2000, 10, 1)));
        library.getBooks().add(new Book("It", "Stephen King", LocalDate.of(2001,8,1)));
        library.getBooks().add(new Book("Become a superstar", "Mark Spencer", LocalDate.of(2010,7,1)));
        library.getBooks().add(book1);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library_set_2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library_set_3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //NEW: removing elements
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
