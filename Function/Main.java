package DSA.Function;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner ( System.in );


    public static  int readInt(String prompt){
        System.out.println (prompt );
        while (true){
            try {
                Integer.parseInt ( sc.nextLine () );
            }catch (NumberFormatException e){
                System.out.println (e.getLocalizedMessage () );
            }

        }
    }

    public static int[] readTwoIntegers(){
        int first = readInt ( "enter the first number...." );
        int sec = readInt ( "enter the second number .." );
        return new int[]{first , sec};
    }

    public static void  addTwoNumbers(){
        int numbs[] = readTwoIntegers ();
        int sum = numbs[0] = numbs[1];
        System.out.println("✅ The sum is: " + sum);
    }
    public static void main ( String[] args ) {
        addTwoNumbers ();
    }
}
