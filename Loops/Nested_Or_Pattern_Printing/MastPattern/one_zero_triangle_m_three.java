package DSA.Loops.Nested_Or_Pattern_Printing.MastPattern;

import java.util.Scanner;

public class one_zero_triangle_m_three
{
//            1
//            01
//            101
//            0101
//            10101
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
               if ((r+c)%2==0){
                   System.out.print(1);
               }else {
                   System.out.print(0);
               }
            }
            System.out.println();
        }
    }
}
