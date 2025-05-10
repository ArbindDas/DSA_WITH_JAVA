package DSA.Loops.Nested_Or_Pattern_Printing;

import java.util.Scanner;

public class oddNumberTriangle
{

//            1
//            13
//            135
//            1357
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int r,c;
        for (r=1; r<=n; r++){
            int odd = 1;
            for (c=1; c<=r; c++){
                System.out.print(odd);
                odd+=2;
            }
            System.out.println();
        }
    }
}
