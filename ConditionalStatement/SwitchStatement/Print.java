package DSA.ConditionalStatement.SwitchStatement;

import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        while (true) { // Keep the loop running until exit condition is met
            Scanner sc = new Scanner(System.in);
            int n = 0; // Initialize n before the loop
            System.out.println("Enter the number: 1, 2, 3 for exit");
            n = sc.nextInt(); // Read user input inside the loop
            switch (n) {
                case 1:
                    System.out.println("1 => " + n);
                    break;
                case 2:
                    System.out.println("2 => " + n);
                    break;
                case 3:
                    System.out.println("Thanks for using!");
                    return; // Exit the program when 3 is entered
                default:
                    System.out.println("Enter a valid number!");
            }

            
        }
    }
}
