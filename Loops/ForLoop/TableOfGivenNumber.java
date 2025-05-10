package DSA.Loops.ForLoop;

import java.util.Scanner;

public class TableOfGivenNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        int n = sc.nextInt();

        printTable(n);

    }

    private static void printTable(int n) {

        for (int i = 1; i <=10; i++) {
            System.out.println(n + " * " + i + " = "+ n*i);
        }
    }
}
