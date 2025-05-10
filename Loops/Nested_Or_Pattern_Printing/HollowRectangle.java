package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
//            ****
//            *  *
//            *  *
//            ****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int r, c;
        for (r = 1; r <= n; r++) {
            for (c = 1; c <= n; c++) {
                if (r == 1 || r == n || c == 1 || c == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
