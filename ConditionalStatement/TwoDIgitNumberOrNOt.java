package DSA.ConditionalStatement;

import java.util.Scanner;

public class TwoDIgitNumberOrNOt
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        isThreeDigitNum(num);
    }
    public static void isThreeDigitNum(int num){
        if (num>9 && num<99){
            System.out.println("the number is two digit number : " +num);
        }else {
            System.out.println("the number is not two digit number : " +num);
        }
    }
}
