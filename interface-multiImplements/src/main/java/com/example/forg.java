package com.example;

/**
 * Created by asabagh on 4/26/18.
 */

public class forg implements fish,rabbit {

    @Override
    public void swim() {
        System.out.print("swimming");
    }

    @Override
    public void jump() {
        System.out.println("jumping");
    }
}
