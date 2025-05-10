package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class NthfibNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        isNthFib(n);

    }

    private static void isNthFib(int n) {
        int first = 0, second = 1;
        int fib = 0;

        if (n == 1) {
            fib = first;
        }
        if (n == 2) {
            fib = second;
        }
        for (int i = 3; i <= n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        System.out.println("the " + n + "th fib number is " + fib);
    }
}
