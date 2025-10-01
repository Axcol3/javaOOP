package org.example.This;

public class Main {
    public static void main(String[] args) {
        KeywordTest key = new KeywordTest();
        KeywordTest.thisInnerClass inner =  key.new thisInnerClass();
    }
}
