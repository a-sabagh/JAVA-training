package com.example;

public class MyClass {
    public int division (int a,int b){
        return a/b;
    }
    public static void main(String args[]){
        int[] number = {2,5,10,0};
        MyClass self = new MyClass();
        for (int temp: number) {
            try {
                int result = self.division(10,temp);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception thrown: " + e.getMessage());
            } finally {
                System.out.println("finally call");
            }
        }
    }
}
