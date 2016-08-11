package com.my;

public class Foo {

    public static void main(String[] args) {
        System.out.println("2^3 is: " + power(2, 3));
    }

    public static double power(int x, int p) {
        return Math.pow(x, p);
    }
}