package com.java8practice.defaultmethod;

interface A {
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements One {
    @Override
    public void sayHello() {
        System.out.println("Child says hello");
    }
}
public class Example1 {
    public static void main(String [] args){
        Child c = new Child();
        c.sayHello();
    }
}
