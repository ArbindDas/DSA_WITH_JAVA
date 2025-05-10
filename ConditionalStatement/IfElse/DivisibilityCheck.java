package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class DivisibilityCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 3 == 0 && number % 15 != 0) {
            System.out.println("The number is divisible by 5 and 3 but not by 15.");
        } else {
            System.out.println("The number does not satisfy the condition.");
        }

        sc.close();
    }
}
