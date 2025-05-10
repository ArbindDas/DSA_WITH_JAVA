package DSA.Loops.ForLoop;

import java.util.Scanner;

public class PrintEvenNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printEven(n);
    }

    private static void printEven(int n)
    {
        for (int i = 1; i <=n; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
