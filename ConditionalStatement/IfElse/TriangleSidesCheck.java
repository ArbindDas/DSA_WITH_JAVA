package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class TriangleSidesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the  first Side ");
        int a = sc.nextInt();


        System.out.println("Enter the  second Side ");
        int b = sc.nextInt();

        System.out.println("Enter the  third Side ");
        int c = sc.nextInt();


        if (isTriangle(a,b,c)){
            System.out.println("The given numbers can be the sides of a triangle.");
        }else {
            System.out.println("The given numbers cannot form a triangle.");
        }
    }
    // Method to check the triangle inequality theorem
    public static boolean isTriangle(int a , int b, int c){
        return (a+b>c && b+c>a && a+c>b);
    }
}
