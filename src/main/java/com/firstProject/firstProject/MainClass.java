package com.firstProject.firstProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MainClass {
    static int y;
    public static void main(String [] args){

        Stream<String> stream = Stream.of("Hi","Bye","g");
        //stream.peek(p -> System.out.println(p)).filter(p -> p.length() > 1).forEach(x -> System.out.println(x));
        Long x = stream.peek(p -> System.out.println(p)).filter(p -> p.length() > 1).count();
        System.out.println(x);
    }

}
