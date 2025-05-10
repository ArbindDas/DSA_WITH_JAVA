package DSA.Loops.ForLoop;

import java.util.Scanner;

public class primeSEcMethod
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printPrime(n);
    }

    private static void printPrime(int n)
    {
        if (n==1) System.out.println("neither prime nor composite : "+n);


        boolean isprime = true;

        for (int i = 2; i < n; i++) {
            if (n%i==0){
                isprime = false;
                break;
            }
        }
        if (isprime==true){
            System.out.println("prime number : "+n);
        }else {
            System.out.println("composite number : "+n);
        }
    }
}
