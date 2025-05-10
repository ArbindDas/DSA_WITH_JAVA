package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printGp(n);

    }

    private static void printGp(int n) {
        int a = 1;
        int r = 2;
        System.out.println("Geometric Progression:");
        for (int i = 0; i < n; i++) {
            int term = a * (int) Math.pow(r, i);
            System.out.println(term + " ");
        }
    }
}
