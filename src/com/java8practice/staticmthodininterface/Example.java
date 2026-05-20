package com.java8practice.staticmthodininterface;

interface A {
    public static void sayHello(){
        System.out.println("Hello");
    }
}
public class Example implements A{

    public static void main(String[] args){
        Example e = new Example();
        //e.sayHello();
        A.sayHello();

    }
}
