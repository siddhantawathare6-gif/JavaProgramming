package org.sid.array;

// Check Prime Number

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 191;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0,1 not prime
        if (n == 2) return true;    // 2 is prime

        if (n % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
