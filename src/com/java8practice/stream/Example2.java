package com.java8practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args){

        //ways to create stream

        List<String> list = Arrays.asList("apple", "banana", "cherry");

        Stream<String> myStream = list.stream();

        String[] array = {"apple", "banana", "cherry"};
        Stream<String> stream = Arrays.stream(array);

        //create direct stream
        Stream<Integer> str = Stream.of(1,2,3);

        Stream<Integer> str1 = Stream.iterate(0, n -> n+1).limit(100);

        Stream<Integer> limit = Stream.generate(() -> (int) Math.random() * 100).limit(5);

    }
}
