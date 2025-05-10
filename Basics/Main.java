package DSA.Basics;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    // Reads a single integer with input validation
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a valid integer.");
            }
        }
    }

    // Returns an array of two integers from the user
    private static int[] readTwoIntegers() {
        int first = readInt("Enter first number: ");
        int second = readInt("Enter second number: ");
        return new int[]{first, second};
    }

    // Adds two integers and prints the result
    private static void addTwoNumbers() {
        int[] numbers = readTwoIntegers();
        int sum = numbers[0] + numbers[1];
        System.out.println("✅ The sum is: " + sum);
    }

    public static void main(String[] args) {
        addTwoNumbers();
    }
}
