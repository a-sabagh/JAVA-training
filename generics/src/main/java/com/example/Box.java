package com.example;

public class Box<T , E> {
    private T t;
    private E e;

    public Box(T t,E e){
        this.t = t;
        this.e = e;
    }

    public T get_t(){ return this.t; }

    public E get_e() { return this.e; }

    public static void main(String args[]){
        Box<Integer,Integer> b = new Box<>(10,20);
        int e = b.get_e();
        int t = b.get_t();

        System.out.printf("t is %d \ne is %d", t, e);
    }

}
