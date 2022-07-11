package com.bridgelabz.generics;

import java.util.Scanner;

public class MaximumUC2 {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public void findMaxInteger() {
        MaximumUC2 mx = new MaximumUC2();
        System.out.println("Enter 3 integer numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Maximum integer number is: " + mx.findMax(num1, num2, num3));
    }

    public void findMaxFloat() {
        MaximumUC2 mx = new MaximumUC2();
        System.out.println("Enter 3 float numbers: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("Maximum float number is: " + mx.findMax(num1, num2, num3));
    }

    public static void main(String[] args) {
        MaximumUC2 mx = new MaximumUC2();
        System.out.println("Welcome to Generic Practice Problem");
        // Maximum Integer ->
        mx.findMaxInteger();

        // Maximum Float ->
        mx.findMaxFloat();

    }



}
