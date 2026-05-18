package com.java8practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0,51,72,81);

        List<Integer> list1  = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(list1);

        List<Integer> maplist = list1.stream().map(x -> x / 2).distinct().collect(Collectors.toList());

    }
}
