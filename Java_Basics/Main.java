package DSA.Java_Basics;

import java.util.Scanner;
//import java.util.logging.Logger;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);



    //    1. Write a Java program to swap two variables without using a third variable.
    public static void swap ( int a , int b ) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println ( "The value of a and b are -> a: " + a + ", b: " + b );
    }


    //     2. Create a Java program that takes user input (name, age, and salary) and displays the data in a formatted output.
    public static void getuserinput ( ) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "enter your name.." );
        String name = sc.nextLine ( );

        System.out.println ( "enter your age..." );
        int age = sc.nextInt ( );


        System.out.println ( "enter your salary ..." );
        double salary = sc.nextDouble ( );


        System.out.println ( "the name is :" + name );
        System.out.println ( "the age is :" + age );
        System.out.println ( "the salary is :" + salary );
    }


//         3. Write a program to check whether a number is even or odd using the modulus operator.

    public static void checkevenodd ( int number ) {
        if (( number & 1 ) == 0) {
            System.out.println ( "the number is even : " + number );
        } else {
            System.out.println ( "the number is odd : " + number );
        }
    }


    //     4. Explicit Type Casting (Narrowing Conversion)
    public static void explicitcasting ( ) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "enter the integer value" );

        int number = sc.nextInt ( );

        System.out.println ( "before casting the value of number is : " + number );

        double convertingIntodouble = (double) number;

        System.out.println ( "After converting the number into double ...." + convertingIntodouble );
    }


    public static void add ( int num1 , int num2 ) {
        int ans = num1 + num2;
        System.out.println ( "the addition of "+num1 + " + "+num2 + " is "+ans);
    }

    public static void minus ( int num1 , int num2 ) {
        int ans = num1 - num2;
        System.out.println ( ans );
    }

    public static void mul ( int num1 , int num2 ) {
        int ans = num1 * num2;
        System.out.println ( ans );
    }

    public static void div ( int num1 , int num2 ) {

        if (num2 == 0) {
            System.out.println ( "Error : Division by zero not allowed ." );
            return;
        }
        int ans = num1 / num2;
        System.out.println ( ans );
    }

//    public static int[] getTwoIntegers ( Scanner sc ) {
//        int[] numbs = new int[2];
//
//        try {
//            numbs[0] = Integer.parseInt ( sc.nextLine ( ) );
//            numbs[1] = Integer.parseInt ( sc.nextLine ( ) );
//        } catch ( NumberFormatException e ) {
//            System.out.println ( "Invalid input. Please enter valid numbers only." );
//            return new int[0];
//        }
//        return numbs;
//    }

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

    private static int[] readTwoIntegers() {
        int first = readInt("Enter first number: ");
        int second = readInt("Enter second number: ");
        return new int[]{first, second};
    }

    //    *5. Create a calculator in Java that takes two numbers and an operator (+, -, , /) as input and returns the result.
    public static void cal ( ) {
        Scanner sc = new Scanner ( System.in );


        while (true) {
            System.out.println ( "Choose operation: +, -, *, / or type 'exit' to quit" );

            String command = sc.nextLine ( ).trim ( ).toLowerCase ( );

            switch (command) {
                case "+" -> {
                    System.out.println ( "enter the two numbers for additon .." );
                    int[] numbs = readTwoIntegers ();
                    Main.add ( numbs[0] , numbs[1] );
                }


                case "-" -> {
                    System.out.println ( "enter the two numbers for sunstraction ..." );
                    int[] numbs =  readTwoIntegers();
                    Main.minus ( numbs[0] , numbs[1] );
                }

                case "*" -> {
                    System.out.println ( "enter the two numbers for multiplication ...." );
                    int[] numbs = readTwoIntegers ();
                    Main.mul ( numbs[0] , numbs[1] );
                }


                case "/" -> {
                    System.out.println ( "enter number 1 amd number 2 for division" );
                    int[] numbs = readTwoIntegers ( );
                    Main.div ( numbs[1] , numbs[2] );
                }


                case "exit" -> {
                    System.out.println ( "exiting from cal function ........" );
                    return;
                }



                default -> System.out.println ( "enter the valid case..... bro" );
            }
        }


    }


    //    6. Write a program that converts temperature from Celsius to Fahrenheit.
//        Covers: Variables, data types, mathematical operations
//        Expected Learning: Handling floats/doubles and formulas.

    public static void celsiustofahrenheit ( ) {

        Scanner sc = new Scanner ( System.in );
        System.out.print ( "Enter the value in Celsius: " );
        double celsius = sc.nextDouble ( );

        double fahrenheit = ( celsius * 9 / 5 ) + 32;
        System.out.println ( "Temperature in Fahrenheit: " + fahrenheit );

    }


    public static void datatypedemo(){

            // Integer example
            int myInt = 10;
            System.out.println("int value: " + myInt);

            // Float example (note the 'f' at the end)
            float myFloat = 10.1234567f;
            System.out.println("float value: " + myFloat);

            // Double example (default for decimal numbers)
            double myDouble = 10.123456789012345;
            System.out.println("double value: " + myDouble);

            // Demonstrate precision
            float floatPi = 3.1415927f;
            double doublePi = 3.141592653589793;
            System.out.println("float π: " + floatPi);
            System.out.println("double π: " + doublePi);
        }


    public static void main ( String[] args ) {


        Main.showMenu ( );


    }

    //    🔹 7. Accept a character from user input and determine whether it is a digit, letter, or special symbol.
    public static void characterchecker ( ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter a single character ..." );
        char inputChar = sc.next ( ).charAt ( 0 );

        if (Character.isLetter ( inputChar )) {
            System.out.println ( "It is a letter." );
        } else if (Character.isDigit ( inputChar )) {
            System.out.println ( "It is a digit." );
        } else {
            System.out.println ( "It is a special symbol." );
        }
    }

//    🔹 10. Create a program that takes two integer inputs and prints their quotient and remainder.
    public  static  void quotientremainder(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();


        int quotient = dividend / divisor;
        int remainder = dividend % divisor;


        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }


    public static void showMenu ( ) {

        Scanner sc = new Scanner ( System.in );


        while (true) {

            System.out.println ( "Enter your methods name to call them like this ...(checkevenodd)" );

            String command = sc.nextLine ( ).trim ( ).toLowerCase ( );


            switch (command) {

                case "swap" -> {
                    System.out.println ( "enter the two numbers for swaping ...." );
                    int first = sc.nextInt ( );
                    int sec = sc.nextInt ( );
                    sc.nextLine ( ); // <--- this consumes the leftover newline
                    // ✅  Solution:
                    //   Always call sc.nextLine() after nextInt() to consume the leftover newline character.
                    Main.swap ( first , sec );
                    break;
                }

                case "getuserinput" -> {
                    System.out.println ( "the user details are showing bellow ...." );
                    Main.getuserinput ( );
                    break;
                }

                case "checkevenodd" -> {
                    System.out.println ( "enter the number for checking wheater a number is even or odd...." );
                    int number = sc.nextInt ( );
                    // ✅ Solution:
                    //  Always call sc.nextLine() after nextInt() to consume the leftover newline character.
                    sc.nextLine ( ); // <--- this consumes the leftover newline
                    Main.checkevenodd ( number );
                    break;
                }

                case "explicitcasting" -> {
                    Main.explicitcasting ( );
                }

                case "cal" -> {
                    Main.cal ( );
                }

                case "celsiustofahrenheit" -> {
                    celsiustofahrenheit ( );
                }


                case "characterchecker" -> {
                    characterchecker ( );
                }

                case "datatypedemo" -> {
                    datatypedemo ();
                }

                case "quotientremainder" -> {
                    quotientremainder ();
                }

                case "exit" -> {
                    System.out.println ( "Exiting from DSA.Basics.Main....." );
                    return;
                }

                default -> System.out.println ( "please enter the valid methods ......" );

            }
        }

    }
}
