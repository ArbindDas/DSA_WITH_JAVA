package DSA.Loops.Nested_Or_Pattern_Printing.StringPatterns;

import java.util.Scanner;

public class AlphabetAndNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int r, c;
        for (r=1; r<=n; r++){
            if (r%2==1){
                for (c=1; c<=r; c++){
                    System.out.print(c);
                }
            }else {
                char print = 'A';
                for (c=1; c<=r; c++){
                    System.out.print(print);
                    print++;
                }
            }
            System.out.println();
        }
    }
}
