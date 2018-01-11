package de.nickstrohm.fibonacci;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacciIterativ(3));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciIterativ(int n) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return 1;
        }

        int fib1 = 0;
        int fib2 = 1;
        for (int i = 1; i < n; i++) {
            int tmp = fib1 + fib2;
            fib1 = fib2;
            fib2 = tmp;
        }

        return fib2;
    }
}
