package com.example;

/**
 * Created by asabagh on 6/5/18.
 */

public class MyClass2 {
    public static void main(String args[]){
        MyClass2 self = new MyClass2();
        try{
            self.division(10,2);
            self.division(10,3);
            self.division(10,0);
            //System.out.println("it work");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally call");
        }
        System.out.println("it work");
    }
    public void division(int a, int b) throws Exception {
        if(b%2 != 0)
            throw new Exception("invalid number");
        int result = a/b;
        System.out.println(result);
    }
}