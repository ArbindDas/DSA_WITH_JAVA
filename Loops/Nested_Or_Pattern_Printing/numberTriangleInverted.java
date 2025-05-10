package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class numberTriangleInverted
{
//            1234
//            234
//            34
//            4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int r,c;
        for (r=1; r<=n; r++){
            for (c=r; c<=n; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
