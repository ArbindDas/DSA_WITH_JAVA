package DSA.Loops.Nested_Or_Pattern_Printing.CutesetQuestions;

import java.util.Scanner;

public class Mast
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n, nsp = 0;
        for (int r=1; r<=n; r++){
            for (int c=1; c<=nsp; c++){
                System.out.print(" ");
            }
            for (int c=1; c<=nst; c++){
                System.out.print("*");
            }
            nsp++;
            nst--;
            System.out.println();

        }
    }
}
