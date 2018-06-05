package com.example;

/**
 * Created by asabagh on 6/5/18.
 */

public class MyClass3 {
    public static void main(String args[]){
        Human ali = new Human();
        try{
            ali.setAge(0);
        }catch (negativeNumber n){
            System.out.println(n.getMsg("negative number"));
        }
    }
}