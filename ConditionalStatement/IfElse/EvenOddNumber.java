package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of num : ");
        try {
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("please enter the valid number : ");
            }
            if (isEven(num)) {
                System.out.println("the enter number is even : " + num);
            } else {
                System.out.println("the number is odd : " + num);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            sc.close();
        }

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
