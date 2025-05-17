package DSA.NumberSystem;

import java.util.Scanner;

public class Main {


    private static final Scanner sc = new Scanner ( System.in );


    public static int readInt ( String prompt ) {
        while (true) {
            System.out.println ( prompt );
            try {
                return Integer.parseInt ( sc.nextLine () );
            }catch (NumberFormatException e) {
                throw new RuntimeException ( e.getCause () );
            }
        }
    }


    public static void dectobin ( ) {

        int num = readInt ( "Enter the number to be converted in Bin" );
        int ornum = num;

        int ans = 0, rem, mul = 1;

        while (num != 0) {
            rem = num % 2;
            num /= 2;
            ans = rem * mul + ans;
            mul *= 10;
        }
        System.out.println ( "After converting  : Dec " + ornum + " into Binary -> " + ans );

    }
    public static void bintodec(){
        int num = readInt ( "Enter the number to be converted into Decimal :" );
        int ornum = num;
        int rem , ans = 0 , mul = 1;
        while (num!=0){
            rem = num % 10;
            num = num/10;
            ans = rem * mul + ans;
            mul*=2;
        }
        System.out.println ("After converting : Bin  : "+ornum + " into decimal : => "+ans);

    }

    public static void main ( String[] args ) {


        while (true) {
            System.out.println ( "Enter the function name to call them ..... eg (DecToBin)  \t for ->  exit, " );
            String message = sc.nextLine ().toLowerCase ().trim ();


            switch (message) {
                case "dectobin" -> {
                    dectobin ();
                }

                case "bintodec"->{
                    bintodec ();
                }

                case "exit" -> {
                    System.out.println ( "Exiting...." );
                    return;
                }

                default -> {
                    System.out.println ( "enter the valid function ..." );
                }
            }
        }
    }
}
