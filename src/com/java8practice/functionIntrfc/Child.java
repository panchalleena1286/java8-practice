package com.java8practice.functionIntrfc;

@FunctionalInterface
public interface Child extends Example2{

//public void sayBye();

    public void sayHello();

    default void bye(){};

    default void no(){};



}
