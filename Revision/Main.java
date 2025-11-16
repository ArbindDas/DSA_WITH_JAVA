package DSA.Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // create a program that add all numbers
    public static int sumofAllNumbers(int... numbers){
        int sum = 0;
        for (int s : numbers){
            sum+=s;
        }
        return sum;
    }

    // Use Arrays.stream for cleaner code
    public static int sumofAllNumbersTwo(int... numbers){
        return Arrays.stream(numbers).sum();
    }

    // Check if a character is uppercase or lowercase
    public static void main(String[] args) {


//        int sumofAllNumbers = sumofAllNumbers(1, 2, 3, 4, 5);
//        System.out.println(sumofAllNumbers);
//
//        int sumofAllNumbersTwo = sumofAllNumbersTwo(1, 2, 3, 4, 5, 6);
//        System.out.println(sumofAllNumbersTwo);


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 10 == 7) {
            System.out.println("The last digit of " + num + " is 7.");
        } else {
            System.out.println("The last digit of " + num + " is not 7.");
        }
    }
}
