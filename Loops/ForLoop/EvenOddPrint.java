package DSA.Loops.ForLoop;

import java.util.Scanner;

public class EvenOddPrint
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        isEvenOr_Odd(n);
    }

    private static void isEvenOr_Odd(int n) {
        for (int i = 1; i <=n; i++) {
            if (i%2==0){
                System.out.println("even "+i);
            }else {
                System.out.println("odd "+i);
            }
        }
    }
}
