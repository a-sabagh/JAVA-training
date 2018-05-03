package com.example;

public class index {
    public static void main(String args[]){
        /*********** Type 1: ************/
        int a = 10;
        if(a == 10){
            System.out.println("a equals 10");
        }else if(a == 20){
            System.out.println("a equals 20");
        }else {
            System.out.println("something else");
        }

        /*********** Type 2: ************/
        int b = 20;
        if(b == 20)
            System.out.println("b equals 20");

        /*********** Type 3: ************/
        int c = (b == 10)? 10 : 20;
        System.out.println("c equals: " + c);

    }
}
