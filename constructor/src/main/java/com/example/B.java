package com.example;

/**
 * Created by asabagh on 3/22/18.
 */

public class B {
    int a;
    String s;

    public B(){
        System.out.println("None-parametrize constructor is called");
    }

    public B(int a1, String s1){
        a = a1;
        s = s1;
    }

    public void info(){
        System.out.println("number is: " + a + " & string is: " + s);
    }
}
