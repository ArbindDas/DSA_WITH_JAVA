package DSA.Loops.SimpleLetcodeProblem;

import java.util.Scanner;

public class Main {
    private static  final Scanner sc = new Scanner (System.in);

    public static int readInt(String prompt){
        while (true){
            System.out.println (prompt);
            try {
                return Integer.parseInt(sc.nextLine ()) ;
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static boolean isPower(int num){
            if (num<1){
                return false;
            }
            int ans = num & (num-1);

            if (ans==0){
                return true;
            }else {
                return false;
            }
    }

        public static void AddDigit(){
            int num = readInt ("Enter the number : ");
            int rem , ans = 0;
            while (num>9){
                ans = 0;  // Important: Reset sum before each pass
                while (num!=0){
                    rem = num % 10;
                    num/=10;
                   ans+=rem;
                }
                num = ans;
            }
            System.out.println (num);
        }


    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 1) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }


    public static void powerOfTwo(){
        int num = readInt ("Enter the number : ");

        if (isPowerOfTwo (num)){
            System.out.println(num + " is a power of 2.");
        }else {
            System.out.println (num+ " is not a power of 2");
        }
    }

    public static boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        }
        while (num != 1) {
            if (num % 4 == 0) {
                num /= 4;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void powerOfFour(){
        int num = readInt ("Enter the number : ");

        if (isPowerOfFour (num)){
            System.out.println(num + " is a power of 4.");
        }else {
            System.out.println (num+ " is not a power of 4");
        }
    }

    public  static void  isPalindrome(){
        int num = readInt ("Enter the number : ");

        int ornum = num ;
        int rem  , ans = 0 ,  mul = 1;
        while (num!=0){
            rem =  num % 10;
            ans = rem * mul + ans;
            num/=10;
            mul*=10;

        }
        if (ornum==ans){
            System.out.println ("is palindrome : "+ornum);
        }else {
            System.out.println ("is not palindrome : "+ornum);
        }
    }
    public static void SquareT() {

        int num = readInt ("Enter the number");

        if (num < 1) {
            System.out.println("Enter a positive number.");
            return;
        }

        boolean isPerfectSquare = false;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                System.out.println(num + " is a perfect square of " + i);
                isPerfectSquare = true;
                break;
            }
        }

        if (!isPerfectSquare) {
            System.out.println(num + " is NOT a perfect square.");
        }
    }
    public static void main ( String[] args ) {
        SquareT();
//        powerOfTwo ();
//        System.out.println ();
//
//        AddDigit ();

//        powerOfFour ();
//        isPalindrome ();
    }
}
