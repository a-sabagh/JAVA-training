package com.example;

/**
 * Created by asabagh on 6/5/18.
 */

public class MyClass4 {
    public static void main(String args[]){
        try{
            MyClass4.division(10,2);
            MyClass4.division(10,5);
            MyClass4.division(10,-3);
            //System.out.println("it work");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (negativeNumber n){
            System.out.println("negative number");
        }finally {
            System.out.println("finally called");
        }
        System.out.println("it work");
    }
    public static void division(int a, int b) throws negativeNumber {
        if(b < 0)
            throw new negativeNumber();
        int result = a/b;
        System.out.println(result);
    }
}