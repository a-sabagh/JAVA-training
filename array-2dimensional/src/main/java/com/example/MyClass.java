package com.example;

public class MyClass {
    public static void main(String args[]){
        int[][] A = new int [3][2];
        A[0][1] = 01;
        A[0][0] = 00;
        A[1][0] = 10;
        A[1][1] = 11;
        A[2][0] = 20;
        A[2][1] = 21;

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println(A[i][j]);
            }
        }

        System.out.println("+++++++++++++++");
        int[][] B = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(B[i][j]);
            }
        }

    }
}
