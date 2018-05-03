package com.example;

import java.util.Scanner;

/**
 * Created by asabagh on 5/3/18.
 */

public class index {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int a = input.nextInt();
        System.out.println("please enter second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("SUM of tow numbers is: " + sum);

    }
}
