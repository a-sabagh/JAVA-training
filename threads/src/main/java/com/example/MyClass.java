package com.example;

public class MyClass {

    public static void main(String arg[]){
        //simple
        A a = new A();
        B b = new B();
        C c = new C();

        Thread athread = new Thread(a,"athread");
        Thread bthread = new Thread(b,"bthread");
        Thread cthread = new Thread(c,"cthread");

        athread.start();
        cthread.start();
        bthread.start();

        //join method

        D j1 = new D();
        D j2 = new D();
        D j3 = new D();

        Thread t1 = new Thread(j1,"number1");
        Thread t2 = new Thread(j2,"number2");
        Thread t3 = new Thread(j3,"number3");

        t1.start();
        try {
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t2.start();
        t3.start();

    }
}
