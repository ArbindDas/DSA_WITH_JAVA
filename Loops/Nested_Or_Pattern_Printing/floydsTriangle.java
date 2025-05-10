package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class floydsTriangle
{
//            1
//            23
//            456
//            78910
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int r, c;
        int print = 1;
        for (r=1; r<=n; r++){
            for (c=1; c<=r; c++){
                System.out.print(print);
                print++;
            }
            System.out.println();
        }

    }
}
