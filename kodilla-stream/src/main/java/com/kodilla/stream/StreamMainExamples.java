package com.kodilla.stream;



import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMainExamples {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b)  -> a / b);

        System.out.println("\n");
        System.out.println("Calculating expressions with method references");


        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);

        System.out.println("\n");
        PoemBeautifier poemBeautifier = new PoemBeautifier();


        String first = poemBeautifier.beautify("ABC", "It is a good day",(a,b) ->  a + " "  + b + " " + a );
        System.out.println(first);

        String second = poemBeautifier.beautify("poland", "If you press CapsLock on keyboard," +
                " the written word will look like this:",(a,b) ->  b + " " + a.toUpperCase()  );
        System.out.println(second);

        String third = poemBeautifier.beautify("POLAND", "If you press CapsLock on keyboard again," +
                " the written word will look like before:",(a,b) ->  b + " " + a.toLowerCase()  );
        System.out.println(third);

        String fourth = poemBeautifier.beautify("Java", "        8",(a,b) ->  a + " " + b.trim()  );
        System.out.println(fourth);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        System.out.println("\n");


        People.getList().stream()                         // [1]
                .map(g -> g.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0,s.indexOf(' ')+2)+".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);                 // [2]

        System.out.println("\n");

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue()  )
                .forEach(System.out::println);

        System.out.println("\n");


        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);
    }
}

