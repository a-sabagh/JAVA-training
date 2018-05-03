package com.example;

import sun.security.provider.SHA;

public class MyClass {
    public static void main (String args[]){
        Phone a = new Phone();
        Phone b = new Nokia();

        System.out.println("************ overriding ************");
        a.ringing();
        b.ringing();
        System.out.println("************ overwriting ************");

        Shape s = new Shape();
        Rectangle r = new Rectangle();
        Square q = new Square();

        s.area();
        r.area(4,2);
        q.area(2);


    }
}
