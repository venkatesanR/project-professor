package com.learning.dsa.interviewleetcode.top150.math;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }

    public static int sqrt(int x) {
        if (x == 0) {
            return 0;
        }

        double initialValue = x;
        double function = func(initialValue, x);

        while (Math.round(function) != 0) {
            double error = function / (2 * initialValue);
            initialValue = initialValue - error;
            function = func(initialValue, x);
        }
        return (int) Math.floor(initialValue);
    }

    private static double func(double x, double n) {
        return (x * x) - n;
    }
}
