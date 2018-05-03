package com.example;

/**
 * Created by asabagh on 4/13/18.
 */

public class Sub extends Super{

    public Sub(int x){ super(x); }

    public void call(){ System.out.println("call from SubClass"); }

    public void SuperCall(){
        super.call();
    }
}
