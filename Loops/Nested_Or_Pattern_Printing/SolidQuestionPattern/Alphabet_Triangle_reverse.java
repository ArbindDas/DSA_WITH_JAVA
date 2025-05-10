package DSA.Loops.Nested_Or_Pattern_Printing.SolidQuestionPattern;

import java.util.Scanner;

public class Alphabet_Triangle_reverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) { // Loop through rows
            // Print spaces for alignment
            for (int c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }
            // Print letters starting from 'A'
            for (int c = 1; c <= r; c++) {
                System.out.print((char)('A' + c - 1)); // Convert to alphabet using ASCII
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
