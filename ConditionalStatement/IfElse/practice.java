package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        if (n%2!=0){
            System.out.println("is true : "+n);
        }else {
            System.out.println("is false : "+n);
        }
    }
}
