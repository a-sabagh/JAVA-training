package com.example;

/**
 * Created by asabagh on 7/20/18.
 */

public class sleep {
    public static void main(String arg[]){
        for(int i=0; i<10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
