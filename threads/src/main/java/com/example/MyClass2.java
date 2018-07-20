package com.example;

/**
 * Created by asabagh on 7/20/18.
 */

public class MyClass2 {
    public static void main(String arg[]){
        //join method

        D j1 = new D();
        D j2 = new D();
        D j3 = new D();

        Thread jthread1 = new Thread(j1,"number1");
        Thread jthread2 = new Thread(j2,"number2");
        Thread jthread3 = new Thread(j3,"number3");

        jthread1.start();
        try {
            jthread1.sleep(3000);
        }catch (InterruptedException e){
            e.getMessage();
        }

        jthread2.start();
        jthread3.start();

    }
}
