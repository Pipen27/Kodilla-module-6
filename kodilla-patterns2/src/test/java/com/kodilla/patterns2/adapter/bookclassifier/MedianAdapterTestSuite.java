package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest (){

        //Given
        Book book1 = new Book("Author1", "Title1", 2003, "S1");
        Book book2 = new Book("Author2", "Title2", 1999, "S2");
        Book book3 = new Book("Author3", "Title3", 2012, "S3");
        Book book4 = new Book("Author4", "Title4", 1975, "S4");
        Book book5 = new Book("Author5", "Title5", 1978, "S5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int yearMedian = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(yearMedian);

        //Then
        Assertions.assertEquals(yearMedian,1999, 0);
    }
}
