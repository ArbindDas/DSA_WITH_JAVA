package DSA.Loops.ForLoop.Medium;

import java.util.Scanner;

public class ArmStrongNumber {
    static public int count(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();


        int countNumber = count(n);
        System.out.println(countNumber);
        isArm(n, countNumber);
    }

    public static void isArm(int number, int count) {
        int ans = 0, rem = 0;
        int ornum = number;
        while (number != 0) {
            rem = number % 10;
            ans = ans + (int) Math.pow(rem, count);
            number /= 10;
        }
        if (ornum == ans) {
            System.out.println("this is armStrong number : " + ans);
        } else {
            System.out.println("this is not armStrong number : ");
        }
    }

}
