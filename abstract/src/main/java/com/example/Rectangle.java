package com.example;

/**
 * Created by asabagh on 4/13/18.
 */

public class Rectangle extends Shape {

    int x;
    int y;
    public Rectangle(int x , int y){
        this.x = x;
        this.y = y;
    }
    public void area(){
        System.out.println("Area of Rectangle is: " + x*y);
    }
}
