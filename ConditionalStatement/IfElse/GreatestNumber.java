package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class GreatestNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int  num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int  num2 = sc.nextInt();
        System.out.println("Enter the first number : ");
        int  num3 = sc.nextInt();
        isGreatest(num1, num2 , num3);

    }
    public static void isGreatest(int n1 ,  int n2 ,int  n3){
        if (n1> n2 && n1 > n3){
            System.out.println("the "+n1 + " is the greatest : Number");
        } else if (n2>n1 && n2>n3) {
            System.out.println("the "+n2 + " is the greatest : Number");
        }else {
            System.out.println("the "+n3 + " is the greatest : number");
        }
    }
}
