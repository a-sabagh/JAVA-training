package com.example;

/**
 * Created by asabagh on 6/5/18.
 */

public class Human {
    public int age;
    public void setAge(int age) throws negativeNumber{
        if(age < 1)
            throw new negativeNumber();
        this.age = age;

    }
    public int getAge(){
        return this.age;
    }
}
