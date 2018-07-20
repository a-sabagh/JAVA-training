package com.example;

/**
 * Created by asabagh on 7/20/18.
 */

public class D implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<6; i++){
            System.out.println(i);
        }
    }

}
