package org.example.Override;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        p.Hello();
        c.Hello();

        Child.Hello();
    }
}
