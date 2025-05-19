package DSA.LinearSearch;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class printArray {

    private static final Scanner sc = new Scanner (System.in);

    public static int readInt ( String prompt ) {
        System.out.println (prompt);
        while (true) {
            try {
                return Integer.parseInt (sc.nextLine ());
            } catch (NumberFormatException e) {
                throw new RuntimeException (e);
            }
        }
    }

    public static int[] printArray ( int arr[] ) {
        System.out.print ("Your Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print (" " + arr[i]);
        }
        System.out.println ();
        return arr;
    }

    public static int[] inputArray ( ) {
        int n = readInt ("Enter the size of array ");
        int[] arr = new int[n];
        int lengthOfArr = arr.length;
        System.out.println ("enter the elements in the array : ");
        for (int i = 0; i < lengthOfArr; i++) {
            arr[i] = sc.nextInt ();
        }
        System.out.println ();

        printArray (arr);
        return arr;
    }


    public static void findMinArrayAndMaxArray ( ) {
        int[] arr = new int[]{4 , 2 , 5 , 1 , 3};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println ("min value is  : " + min);
        System.out.println ("max value is  : " + max);
    }

    public static void searchElement ( ) {
        int[] arr = new int[]{4 , 2 , 5 , 1 , 3};
        int search = readInt ("Enter the value to be search");
        boolean find = false;
        int value = - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                value = i;
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println ("the value is present at index : " + value);
        }else {
            System.out.println ("the value is not present : ");
        }
    }

    public static void isRevArray ( int fi , int ei , int[] arr ) {
        int a = fi;
        int b = ei;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public static void afterRiv ( ) {
        int arr[] = inputArray ();

        isRevArray (0 , arr.length - 1 , arr);
        System.out.println ("after reverse your array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print (" " + arr[i]);
        }
    }

    public static void findSecMax ( ) {
        int[] arr = new int[]{8 , 2 , 5 , 1 , 3};

        if (arr.length < 2) {
            System.out.println ("Array must have at least two elements.");
            return;
        }

        int fmax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fmax) {
                fmax = arr[i];
            }else if (arr[i] > secMax && arr[i] != fmax) {
                secMax = arr[i];
            }

        }
        if (secMax == Integer.MIN_VALUE) {
            System.out.println ("No distinct second maximum found.");
        }else {
            System.out.println ("First max: " + fmax);
            System.out.println ("Second max: " + secMax);
        }

    }


    public static void fib ( ) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int num : arr) {
            System.out.print (num + " ");
        }
    }

    public static void findMissingNumber(){
        int num = readInt ("Enter the size of array :");
        int []arr = new int[num-15];


        System.out.println ("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt ();
        }
        System.out.println ("the given array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i]);
        }
        

        int presentNumber = 0;
        int total = num*(num+1)/2;
        for (int i = 0; i < arr.length; i++) {
             presentNumber  = presentNumber+arr[i];
        }
        
        int missing = total - presentNumber;
        System.out.println ("the missing number is : "+missing);

    }


    public static void findMissingNumberTwo() {
        int num = readInt("Enter the size of array:");
        int[] arr = new int[num - 1];
        Set<Integer> integerSet = new HashSet<>();

        System.out.println("Enter " + (num - 1) + " values from 1 to " + num + " (no duplicates):");

        int total = num * (num + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = sc.nextInt();
            if (val < 1 || val > num || integerSet.contains(val)) {
                System.out.println("Invalid input: enter values between 1 to " + num + " without duplicates.");
                return;
            }
            integerSet.add(val);
            actualSum += val;
        }

        int missing = total - actualSum;
        System.out.println("The missing number is: " + missing);
    }


    public static void main ( String[] args ) {

//        inputArray ();
//        findMinArrayAndMaxArray ();
//        searchElement ();

//        afterRiv ();

//        findSecMax ();
//        isFib ();
//        fib ();
//        findMissingNumber();
//        findMissingNumberTwo ();
    }
}
