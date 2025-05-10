package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class AreaofPerimeterGreator {

    public static void main(String[] args) {

    }

    public static void isArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        int lenght = sc.nextInt();
        System.out.println("enter the breadth ");
        int breadth = sc.nextInt();

        int area = lenght * lenght;
        int perimter = 2 * (lenght + breadth);

        if (area > perimter) {
            System.out.println("the area is greator then perimeter : " + area);
        } else {
            System.out.println("the perimeter is greator then area : " + perimter);
        }

        sc.close();
    }
}
