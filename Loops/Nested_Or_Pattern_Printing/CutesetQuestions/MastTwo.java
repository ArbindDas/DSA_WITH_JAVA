package DSA.Loops.Nested_Or_Pattern_Printing.CutesetQuestions;

import java.util.Scanner;

public class MastTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Loop for each row
        for (int r = 1; r <= n; r++) {
            // Print spaces (equal to the row number - 1)
            for (int c = 1; c < r; c++) {
                System.out.print(" ");
            }
            // Print stars (equal to n - row number + 1)
            for (int c = 1; c <= n - r + 1; c++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
