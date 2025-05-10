package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class SecGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printSecgp(n);

    }

    private static void printSecgp(int n) {
        int a = 3;
        int r = 4;
        for (int i = 0; i < n; i++) {
            int term = a * (int) Math.pow(r, i);
            System.out.println(term);
        }
    }
}
