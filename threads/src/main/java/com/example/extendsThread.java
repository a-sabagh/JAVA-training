package com.example;

/**
 * Created by asabagh on 7/20/18.
 */

public class extendsThread extends Thread{

    public void run(){
        System.out.println("a");
     }
    public static void main(String arg[]){
        extendsThread a = new extendsThread();
        a.start();
    }
}
