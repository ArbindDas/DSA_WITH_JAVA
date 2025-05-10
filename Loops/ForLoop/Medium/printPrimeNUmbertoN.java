package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class printPrimeNUmbertoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printprimeNumber(n);

    }
    private static void printprimeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isprime = true;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }
        }
    }
}
