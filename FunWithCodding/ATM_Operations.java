package DSA.FunWithCodding;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ATM_Operations {
    private static double accountBalance = 0;
    private static Scanner sc = new Scanner ( System.in );

    @FunctionalInterface
    private interface BalanceOperation {
        void execute ( double amount );
    }

    private static void performBalanceOperation ( String prompt , BalanceOperation operation ) {
        System.out.print ( prompt );
        double amount = readDouble ( );

        if (amount <= 0) {
            System.out.println ( "Invalid amount. Please enter a positive value." );
            return;
        }

        operation.execute ( amount );
    }

    private static double readDouble ( ) {
        while (true) {
            try {
                return Double.parseDouble ( sc.nextLine ( ) );
            } catch ( NumberFormatException e ) {
                System.out.println ( "Invalid input. Please enter a number." );
            }
        }
    }

    private static int readInt ( ) {
        while (true) {
            try {
                return Integer.parseInt ( sc.nextLine ( ) );
            } catch ( NumberFormatException e ) {
                System.out.println ( "Invalid input. Please enter an integer." );
            }
        }
    }

    public static void withdraw ( ) {
        performBalanceOperation ( "Enter the amount you want to withdraw: " , amount -> {
            if (amount > accountBalance) {
                System.out.println ( "Insufficient funds. Your balance is: " + accountBalance );
            } else {
                accountBalance -= amount;
                System.out.println ( "Withdrawal successful. Remaining balance: " + accountBalance );
            }
        } );
    }

    public static void deposit ( ) {
        performBalanceOperation ( "Enter the amount you want to deposit: " , amount -> {
            accountBalance += amount;
            System.out.println ( "Deposit successful. Current balance: " + accountBalance );
        } );
    }

    public static void checkBalance ( ) {
        System.out.println ( "Your current balance is: " + accountBalance );
    }

    public static void main ( String[] args ) {
        // Create a map of operations
        Map < Integer, Runnable > operations = new HashMap <> ( );
        operations.put ( 1 , ATM_Operations :: withdraw );
        operations.put ( 2 , ATM_Operations :: deposit );
        operations.put ( 3 , ATM_Operations :: checkBalance );

        while (true) {
            System.out.println ( "\nWelcome to the ATM Machine" );
            System.out.println ( "1. Withdraw" );
            System.out.println ( "2. Deposit" );
            System.out.println ( "3. Check Balance" );
            System.out.println ( "4. Exit" );
            System.out.print ( "Enter your choice: " );

            int choice = readInt ( );

            if (choice == 4) {
                System.out.println ( "Thank you for using our ATM. Goodbye!" );
                sc.close ( );
                return;
            }

            Runnable operation = operations.get ( choice );
            if (operation != null) {
                operation.run ( );
            } else {
                System.out.println ( "Invalid choice. Please try again." );
            }
        }
    }
}