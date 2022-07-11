package com.bridgelabz.generics;

import java.util.Scanner;

public class MaximumRF1{
    public static void main(String[] args) {
        System.out.println("Maximum number out of three integers is: " + maximum(11, 18, 200));
        System.out.println("Maximum number out of three float is: " + maximum(45f, 75f, 88f));
        System.out.println("Maximum among three string is: " + maximum("Apple", "Peach", "Banana"));
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        if (y.compareTo(x) > 0) {
            return y;
        } else if (z.compareTo(y) > 0) {
            return z;
        } else {
            return x;
        }

    }
}
