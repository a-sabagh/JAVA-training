package com.example;

/**
 * Created by asabagh on 7/19/18.
 */

public class genMethod {
    public static <E> void printArray(E[] inputArray){
        for(E tmp: inputArray){
            System.out.println(tmp);
        }
    }
    public static <T> T test(T t){
        return t;
    }
    public static void main(String args[]){
        Integer int_arr[] = {1,2,3,4,5};
        String str_arr[] = {"mahdi","abolfazl","mohamad","kurosh"};
        Double dbl_arr[] = {1.2,2.8,6.4,5.3};

        System.out.println("* integer array *");
        genMethod.printArray(int_arr);

        System.out.println("* string array *");
        genMethod.printArray(str_arr);

        System.out.println("* double array *");
        genMethod.printArray(dbl_arr);
    }
}
