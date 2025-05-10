package DSA.Loops.ForLoop;

import java.util.Scanner;

public class SumofN_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        sumofNNumber(n);

    }

    private static void sumofNNumber(int n) {
        int ans = 0;
        for (int i = 0; i <=n; i++) {
            ans+=i;
        }
        System.out.println("the sum of " + n + " is "  + ans);
    }
}
