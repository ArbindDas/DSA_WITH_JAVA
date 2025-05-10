package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n :");
        int n = sc.nextInt();

        printCountDIgit(n);

    }
    private static void printCountDIgit(int n) {

        int count = 0;
        int originalNumber = n;
        // The loop will run until the number is reduced to 0
        for (; n > 0; n /= 10) {
            count++;
        }
        if (originalNumber == 1) {
            count = 1;
        }

        System.out.println(count);
    }
}
