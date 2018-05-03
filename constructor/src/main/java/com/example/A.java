package com.example;

public class A {
    public static void main(String args[]) {
        B obj1 = new B();
        B obj2 = new B(10, "mahdi");
        obj1.info();
        obj2.info();
    }
}
