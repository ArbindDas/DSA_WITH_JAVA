package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class RectangleSquareCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth :");
        int breadth = sc.nextInt();


        if (length == breadth){
            System.out.println("The given rectangle is a square.");
        }else {
            System.out.println("the given rectangle is not a sqaure.");
        }
    }
}
