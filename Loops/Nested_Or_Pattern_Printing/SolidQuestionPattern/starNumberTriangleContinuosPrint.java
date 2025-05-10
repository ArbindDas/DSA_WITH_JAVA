package DSA.Loops.Nested_Or_Pattern_Printing.SolidQuestionPattern;

import java.util.Scanner;

public class starNumberTriangleContinuosPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        int print = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print(print);
                print++;
            }
            System.out.println();
        }

    }
}
