package DSA.Loops.Nested_Or_Pattern_Printing.CutesetQuestions;

import java.util.Scanner;

public class star_pyramid_MethodTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int nst = 1, nsp = n-1;
        for (int r=1; r<=n; r++){
            for (int c=1; c<=nsp; c++){
                System.out.print(" ");
            }
            for (int c=1; c<=nst; c++){
                System.out.print("*");
            }
            nsp--;
            nst+=2;
            System.out.println();

        }
    }
}
