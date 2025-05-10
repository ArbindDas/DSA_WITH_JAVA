package DSA.Loops.Nested_Or_Pattern_Printing.MastPattern;

import java.util.Scanner;

public
class
start_cross {

    public
    static void
    main
            (String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        for (int r=1; r<=n; r++){
            for (int c=1; c<=n; c++){
                if (r==c || (r+c==n+1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
