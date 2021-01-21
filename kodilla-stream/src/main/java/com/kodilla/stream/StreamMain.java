package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {
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

    }
}
