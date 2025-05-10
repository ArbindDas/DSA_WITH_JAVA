package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class Divisibleby5And3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        isDivisibleByFiveOrNot(number);
    }
    public static void isDivisibleByFiveOrNot(int number){
        if (number%5 ==0 && number%3==0){
            System.out.println("the number is divisible by 5 and 3 both : ");

        }else {
            System.out.println("the number is not divisible by 5 and 3 : ");
        }
    }
}
