package DSA.Loops.WhileLoop;

import java.util.Scanner;

public class ReverseANumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        isrev(n);
    }

    private static void isrev(int n) {
        int rem = 0 , ans = 0;
        System.out.println("before reverse your number is : "+n);

        while (n!=0){
             rem = n % 10;
             ans = ans * 10 + rem;
             n/=10;
        }
        System.out.println(
                "after reverse your number is : "+ans
        );
    }
}
