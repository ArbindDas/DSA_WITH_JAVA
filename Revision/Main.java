package DSA.Revision;

import java.util.Arrays;

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
    public static void main(String[] args) {


        int sumofAllNumbers = sumofAllNumbers(1, 2, 3, 4, 5);
        System.out.println(sumofAllNumbers);

        int sumofAllNumbersTwo = sumofAllNumbersTwo(1, 2, 3, 4, 5, 6);
        System.out.println(sumofAllNumbersTwo);
    }
}
