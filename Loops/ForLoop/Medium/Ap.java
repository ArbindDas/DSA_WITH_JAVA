package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class Ap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printAp(n);

    }

    private static void printAp(int n) {

        for (int i = 1; i<=2*n-1 ; i+=2) {
            System.out.println(i);
        }
    }
}
