package com.bridgelabz.generics;


public class MaximumRF2<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    MaximumRF2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum () {

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }


    public static void main(String[] args) {
        MaximumRF2 compareInteger = new MaximumRF2(2345, 12, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());
        MaximumRF2  comapreFloat = new MaximumRF2(123.f, 345f, 678f);
        System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());
        MaximumRF2 compareString = new MaximumRF2("Apple", "Orange", "potato");
        System.out.println("Maximum among three string is: " + compareString.maximum());
    }

}
