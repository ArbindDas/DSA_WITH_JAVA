package DSA.Loops.Nested_Or_Pattern_Printing.StringPatterns;


import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                // Print '*' for boundary cells
                if (r == 1 || r == rows || c == 1 || c == cols) {
                    System.out.print("*");
                } else {
                    // Print space for inner cells
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
        sc.close(); // Close the scanner
    }
}
