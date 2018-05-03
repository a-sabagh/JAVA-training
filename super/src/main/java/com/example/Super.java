package com.example;

/**
 * Created by asabagh on 4/13/18.
 */

public class Super {

    public int x;

    public Super(int x){
        this.x = x;
    }

    public void getX(){ System.out.println(x); }

    public void call(){
        System.out.println("call from SuperClass");
    }
}
