package DSA.Loops.WhileLoop;

import java.util.Scanner;

public class palindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        ispal(n);
    }

    private static void ispal(int n) {
        int rem = 0, ans = 0;
        int ornum = n;
        while (n != 0) {
            rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        if (ornum == ans) {
            System.out.println("is palindrome : " + ans);
        } else {
            System.out.println("is not palindrome : " + ans);
        }
    }
}

