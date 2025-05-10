package DSA.Loops.Nested_Or_Pattern_Printing.StringPatterns;

import java.util.Scanner;

public class AlphabetTriangle
{
//    A
//    AB
//    ABC
//    ABCD
//    ABCDE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        char r, c;
//        for (r='A';r<'A'+n; r++){
//            for (c = 'A'; c<=r; c++){
//                System.out.print(c);
//            }
//            System.out.println();
//        }
        for (r=1; r<=n; r++){
            for (c=1; c<=r; c++){
                System.out.print((char) ('A'+c-1));
            }
            System.out.println();
        }
    }
}
