package DSA.Loops.WhileLoop;

import java.util.Scanner;

public class CountDIgit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n :");
        int  n = sc.nextInt();
        isCount(n);

    }
    public static void isCount(int n){
        int count = 0;
        while (n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
