package com.kodilla.stream.beautifier;

public class PoemBeautifier {


    public String beautify(String a, String b, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate( a,b );
        return result;
    }

}
