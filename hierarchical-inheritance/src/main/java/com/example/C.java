package com.example;

/**
 * Created by asabagh on 3/22/18.
 */

public class C extends A {
    public static void main(String args[]){
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("data in A class is: " + objA.data);
        System.out.println("data in B class is: " + objB.data);
        System.out.println("data in C class is: " + objC.data);

    }
}
