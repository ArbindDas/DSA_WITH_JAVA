package DSA.Loops.ForLoop;

import java.util.Scanner;

public class Print1toN_numbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printNnumber(n);
    }

    private static void printNnumber(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }
}
