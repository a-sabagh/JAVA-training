package com.example;

public class A {
    public void show(){
        System.out.println(this);
    }
    public void c(){
        System.out.println("show c method in class");
    }
    public void d(){
        this.c();
    }
}
