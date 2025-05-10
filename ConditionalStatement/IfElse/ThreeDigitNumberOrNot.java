package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class ThreeDigitNumberOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        isThreeDigitNum(num);
    }
    public static void isThreeDigitNum(int num){
        if (num>99 && num<1000){
            System.out.println("the number is three digit number : " +num);
        }else {
            System.out.println("the number is not three digit number : " +num);
        }
    }
}
