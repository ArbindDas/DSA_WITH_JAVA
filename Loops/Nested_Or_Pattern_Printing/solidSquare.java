package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class solidSquare
{
//            ****
//            ****
//            ****
//            ****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        int row, column;
        for (row = 1; row<=n; row++){
            for (column = 1; column<=n; column++){
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
