package com.java8practice.stream;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args){

        //imparative approach
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;
        for(int i=0; i< array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
    }

    //Stream -declarative approach
    int [] array2 = {1,2,3,4,5};
    int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();

    System.out.print(sum2);

}
