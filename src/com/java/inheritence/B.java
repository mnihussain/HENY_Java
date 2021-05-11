package com.java.inheritence;

public class B extends A{
    {
        System.out.println("C ");
    }

    static {
        System.out.println("D");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
