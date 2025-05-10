package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class fibonnaciSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();


        isfibser(n);
    }

    private static void isfibser(int n) {
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(first + " "); // Print the first Fibonacci number (0)
            } else if (i == 2) {
                System.out.println(second + " "); // Print the second Fibonacci number (1)
            } else {
                int fib = first + second;
                System.out.println(fib);
                first = second;
                second = fib;
            }

        }
    }
}
