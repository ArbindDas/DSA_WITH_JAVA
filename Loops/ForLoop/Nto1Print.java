package DSA.Loops.ForLoop;

import java.util.Scanner;

public class Nto1Print {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printNto1(n);
    }

    private static void printNto1(int n) {
        for (int i = n; i>=1 ; i--) {
            System.out.println(i);
        }
    }
}
