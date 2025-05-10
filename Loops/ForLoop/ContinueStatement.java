package DSA.Loops.ForLoop;

import java.util.Scanner;

public class ContinueStatement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printOdd(n);
    }

    private static void printOdd(int n) {

        for (int i = 1; i <=n; i++) {
            if (i%2==0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
