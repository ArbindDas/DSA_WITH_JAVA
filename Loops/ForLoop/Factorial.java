package DSA.Loops.ForLoop;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        fact(n);

    }

    private static void fact(int n) {
        int ans = 1;
        for (int i = 1; i <=n; i++) {
            ans*=i;
        }
        System.out.println("the factorail of "+ n + " is "+ans);
    }
}
