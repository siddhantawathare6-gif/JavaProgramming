package org.sid.string;

public class FibonacciSeries {
    public static void main(String[] args) {

        int number = 10;
        fib(number);

    }

    public static void fib(int number) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i <= number; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

}
