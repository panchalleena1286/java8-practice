package com.java8practice.funtionalinterfacewithlambda;

public class MainClass {
    public static void main(String[] args){
        Employee employee = () -> "Software Engineer";
        System.out.println(employee.getName());

        Employee editor = () -> "Editor";
        System.out.println(editor.getName());

        

    }
}
