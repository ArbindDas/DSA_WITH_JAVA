package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class starNumberTriangle
{
//            1
//            12
//            123
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        int r, c;
        for (r=1; r<=n; r++){
            for (c=1; c<=r; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
