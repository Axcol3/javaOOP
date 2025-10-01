package org.example.Super;

public class Parent {
    String name;
    int age;
    protected String message = "it is Parent";
    public Parent() {
        System.out.println("Parent default Constructor");
    }
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent parameterized constructor");
    }

    public void print() {
        System.out.println(message);
    }

}
