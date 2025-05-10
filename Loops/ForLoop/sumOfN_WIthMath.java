package DSA.Loops.ForLoop;

import java.util.Scanner;

public class sumOfN_WIthMath
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printSum(n);

    }

    private static void printSum(int n)
    {
        int ans = n*(n+1)/2;
        System.out.println(ans);
    }
}
