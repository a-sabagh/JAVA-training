package com.example;

/**
 * Created by asabagh on 3/22/18.
 */

public class C extends B {
    public void dispalyData(){
        System.out.println("data is: " + data);
    }
    public static void main(String args[]){
        C obj = new C();
        obj.dispalyData();
    }
}
