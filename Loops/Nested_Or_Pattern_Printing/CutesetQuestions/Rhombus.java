package DSA.Loops.Nested_Or_Pattern_Printing.CutesetQuestions;

import java.util.Scanner;

public class Rhombus
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int r=1; r<=n; r++){
            for (int c=1; c<=n-r; c++){
                System.out.print(" ");
            }
            for (int c=1; c<=n; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
