package com.bridgelabz.generics;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaximumUC4<T extends Comparable<T>> {
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

    public static <T extends Comparable<T>> T findMax(List<T> arr) {

        T max = arr.get(0);

        for (T key : arr) {
            if (key.compareTo(max) > 0)
                max = key;
        }
        return max;
    }

    public void findMaxInteger() {
        MaximumUC4 mx = new MaximumUC4();
        System.out.println("Enter 3 integer numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Maximum integer number is: " + mx.findMax(num1, num2, num3));
    }

    public void findMaxFloat() {
        MaximumUC4 mx = new MaximumUC4();
        System.out.println("Enter 3 float numbers: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("Maximum float number is: " + mx.findMax(num1, num2, num3));
    }

    public void findMaxString() {
        MaximumUC4 mx = new MaximumUC4();
        System.out.println("Enter 3 strings: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        System.out.println("Maximum float number is: " + mx.findMax(str1, str2, str3));
    }

    public static void main(String[] args) {
        MaximumUC4 mx = new MaximumUC4();
        System.out.println("Welcome to Generic Practice Problem");
        // Maximum Integer ->
        mx.findMaxInteger();

        // Maximum Float ->
        mx.findMaxFloat();

        // Maximum String ->
        mx.findMaxString();

        MaximumUC4 obj = new MaximumUC4();
        System.out.println("---------------- UC4 -> Options ---------------");
        System.out.println("The Maximum integer is: " + obj.findMax(Arrays.asList(12,24,36,48)));
        System.out.println("The Maximum float is: " + obj.findMax(Arrays.asList(10.34,65.54,24.87)));
        System.out.println("The Maximum string is: " + obj.findMax(Arrays.asList("Apple", "Peach", "Banana")));
    }
}
