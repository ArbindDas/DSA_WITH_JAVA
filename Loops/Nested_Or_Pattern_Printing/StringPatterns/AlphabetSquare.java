package DSA.Loops.Nested_Or_Pattern_Printing.StringPatterns;

import java.util.Scanner;


public class AlphabetSquare {
//    ABCDE
//    ABCDE
//    ABCDE
//    ABCDE
//    ABCDE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        char r, c;
        for (r = 'A'; r < 'A' + n; r++) {
            for (c = 'A'; c < 'A' + n; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
}
