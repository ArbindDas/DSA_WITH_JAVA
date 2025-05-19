package DSA.Loops.SimpleLetcodeProblem;

import java.util.Scanner;
import java.util.HashSet;

public class Test {

    public static void findMissingNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n (should be > 1): ");
        int n = sc.nextInt();  // Total numbers from 1 to n

        int[] arr = new int[n - 1];
        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Enter " + (n - 1) + " numbers between 1 and " + n + ":");
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = sc.nextInt();
            if (val < 1 || val > n || seen.contains(val)) {
                System.out.println("Invalid input: value must be between 1 and " + n + " and no duplicates.");
                return;
            }
            seen.add(val);
            actualSum += val;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - actualSum;
        System.out.println("The missing number is: " + missing);
    }

    public static void main(String[] args) {
        findMissingNumber();
    }
}
