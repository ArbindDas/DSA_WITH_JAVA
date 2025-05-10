package DSA.Loops.Nested_Or_Pattern_Printing.MastPattern;

import java.util.Scanner;

public class start_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        int ornum = n;
        int midddleNumber = (n+1)/2;
        for (int r=1; r<=n; r++){
            for (int c=1; c<=n; c++){
               if (r==midddleNumber || c==midddleNumber){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
