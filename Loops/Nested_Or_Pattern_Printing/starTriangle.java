package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class starTriangle
{
//            *
//            **
//            ***
//            ****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        int r, c;
        for (r = 1; r<=n; r++){
            for (c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
