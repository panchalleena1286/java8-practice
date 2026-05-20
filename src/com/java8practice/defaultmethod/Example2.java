package com.java8practice.defaultmethod;

interface One {
    default void sayHello(){
        System.out.println("One say hello");
    }
}

interface Two {
    default void sayHello(){
        System.out.println(" Two say hello");
    }
}

public class Example2 implements One, Two{

    public static void main(String[] args){
        Example2 e = new Example2();
        e.sayHello();
    }
    @Override
    public void sayHello(){
        //System.out.println(" My own say hello");
        One.super.sayHello();
    }
}
