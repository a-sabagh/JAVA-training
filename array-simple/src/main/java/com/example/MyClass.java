package com.example;

public class MyClass {
    public static void main(String args[]){
        int[] A = new int[5];
        A[0] = 0;
        A[1] = 1;
        A[2] = 2;
        A[3] = 3;
        A[4] = 4;
        int count = A.length;
        for(int i=0;i<count;i++){
            int tmp = A[i];
            System.out.println(tmp);
        }

        System.out.println("===========");

        int B[] = {1,2,3,4,5};
        int count2 = B.length;
        for(int i=0;i<count2;i++){
            System.out.println(B[i]);
        }

    }
}
