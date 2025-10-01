package org.example.This;

public class KeywordTest {
    String name ;
    int age;
    private String str = "T.E.S.T";
    public KeywordTest() {
        printInstance(this);
    }
    public void printInstance(KeywordTest thisKeyword) {
        System.out.println(thisKeyword);
    }

    public class thisInnerClass{
        boolean isInnerClass = true;
        public thisInnerClass() {
            KeywordTest thisKeyword = KeywordTest.this;
            String str = KeywordTest.this.str;
            System.out.println(str);
        }
    }
}
