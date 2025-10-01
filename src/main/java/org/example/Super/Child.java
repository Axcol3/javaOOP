package org.example.Super;

public class Child extends Parent {
    private String message = "it is Child";
    public Child() {
        super();
        System.out.println("Child constructor");
        System.out.println(super.message);
        super.print();
        print();

    }
    public void print() {
        System.out.println(message);
    }
}
