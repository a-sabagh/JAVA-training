package com.example;

/**
 * Created by asabagh on 7/19/18.
 */

public class restrictWCT<T extends Number> {
    private T t;

    public restrictWCT(T t){
        this.t = t;
    }

    public T get_t(){
        return this.t;
    }

    public static void main(String args[]){

        restrictWCT<Integer> r = new restrictWCT<>(10);
        int i = r.get_t();
        System.out.printf("integer is %d",i);
    }
}
