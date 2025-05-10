package DSA.Loops.ForLoop;

import java.util.Scanner;

public class FactorOFN_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        factorOfN(n);

    }

    private static void factorOfN(int n)
    {
        int count = 0;
        for (int i = 1; i<n; i++) {
            if (n%i==0){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("total factor is "+count);
    }
}
