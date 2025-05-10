package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class DivisibileBy5orNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        isDivisibleByFiveOrNot(number);
    }
    public static void isDivisibleByFiveOrNot(int number){
        if (number%5 ==0){
            System.out.println("the number is divisible by 5 : ");

        }else {
            System.out.println("the number is not divisible by 5 : ");
        }
    }
}
