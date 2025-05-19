package DSA.LinearSearch;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LinearSearchProblems {

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
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print (" " + arr[i]);
        }
        System.out.println ();
        return arr;
    }

    public static int[] inputAndPrintArray ( ) {
        int n = readInt ("Enter the size of array ");
        int[] arr = new int[n];
        int lengthOfArr = arr.length;
        System.out.println ("enter the elements in the array : ");
        for (int i = 0 ; i < lengthOfArr ; i++) {
            arr[i] = sc.nextInt ();
        }
        System.out.println ();

        printArray (arr);
        return arr;
    }


    public static void findMinMax ( ) {
        int[] arr = new int[] {4 , 2 , 5 , 1 , 3};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {
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
        int[] arr = new int[] {4 , 2 , 5 , 1 , 3};
        int search = readInt ("Enter the value to be search");
        boolean find = false;
        int value = - 1;
        for (int i = 0 ; i < arr.length ; i++) {
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

    public static void reverseArray ( int fi , int ei , int[] arr ) {
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
        int arr[] = inputAndPrintArray ();

        reverseArray (0 , arr.length - 1 , arr);
        System.out.println ("after reverse your array is : ");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print (" " + arr[i]);
        }
    }

    public static void findSecondMax ( ) {
        int[] arr = new int[] {8 , 2 , 5 , 1 , 3};

        if (arr.length < 2) {
            System.out.println ("Array must have at least two elements.");
            return;
        }

        int fmax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
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


    public static void generateFibonacci ( ) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2 ; i < arr.length ; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int num : arr) {
            System.out.print (num + " ");
        }
    }

    public static void findMissingNumberMethod1 ( ) {
        int num = readInt ("Enter the size of array :");
        int[] arr = new int[num - 15];


        System.out.println ("Enter the elements in the array : ");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt ();
        }
        System.out.println ("the given array is : ");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println (arr[i]);
        }


        int presentNumber = 0;
        int total = num * ( num + 1 ) / 2;
        for (int i = 0 ; i < arr.length ; i++) {
            presentNumber = presentNumber + arr[i];
        }

        int missing = total - presentNumber;
        System.out.println ("the missing number is : " + missing);

    }


    public static void findMissingNumberMethod2 ( ) {
        int num = readInt ("Enter the size of array:");
        int[] arr = new int[num - 1];
        Set < Integer > integerSet = new HashSet <> ();

        System.out.println ("Enter " + ( num - 1 ) + " values from 1 to " + num + " (no duplicates):");

        int total = num * ( num + 1 ) / 2;
        int actualSum = 0;

        for (int i = 0 ; i < arr.length ; i++) {
            int val = sc.nextInt ();
            if (val < 1 || val > num || integerSet.contains (val)) {
                System.out.println ("Invalid input: enter values between 1 to " + num + " without duplicates.");
                return;
            }
            integerSet.add (val);
            actualSum += val;
        }

        int missing = total - actualSum;
        System.out.println ("The missing number is: " + missing);
    }

    public static void checkPalindrome ( ) {
        int num = readInt ("Enter the size of array:");
        int[] arr = new int[num];

        System.out.println ("Enter the elements in the array");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt ();
        }

        System.out.println ("your array is ");
        for (int value : arr) {
            System.out.println (
                    arr[value]
            );
        }

        int[] rev = new int[num];
        for (int i = 0 ; i < arr.length ; i++) {
            rev[i] = arr[i];
        }

        reverseArray (0 , arr.length - 1 , arr);
        boolean ispal = true;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] != rev[i]) {
                ispal = false;
                break;
            }
        }

        if (ispal) {
            System.out.println ("is palindrome number");
        }else {
            System.out.println ("is not palindrome ");
        }
    }

    public static void findDuplicate ( ) {
        int[] arr = new int[] {1 , 2 , 3 , 5 , 2};
        int dup = - 1;

        boolean isDuplicate = false;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[j] == arr[i]) {
                    isDuplicate = true;
                    dup = i;
                    break;
                }
                if (isDuplicate) break;
            }
        }
        if (isDuplicate) {
            System.out.println ("The duplicate number is: " + arr[dup]);
            System.out.println ("Duplicate found at index: " + dup);
        }else {
            System.out.println ("There is no duplicate number in your provided array.");
        }
    }

    public static void findUniqueNumber ( ) {
        int[] arr = new int[] {1 , 2 , 3 , 3 , 1};
        int uniqueVal = - 1;
        int dup = - 1;

        boolean isUnique = false;
        for (int i = 0 ; i < arr.length ; i++) {
            boolean isDuplicate = false;
            for (int j = 0 ; j < arr.length ; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (! isDuplicate) {
                uniqueVal = arr[i];
                break; // If only one unique number is required
            }
        }
        if (uniqueVal != - 1) {
            System.out.println ("Unique number is: " + uniqueVal);
        }else {
            System.out.println ("No unique number found.");
        }
    }


    public static void rotateArray ( ) {
        int num = readInt ("Enter the size of array : ");
        int[] arr = new int[num];

        System.out.print ("Enter the elements in the array => ");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt ();
        }

        System.out.print ("before rotate your array is  =>");
        for (int val : arr) {
            System.out.print (" " + val);
        }
        System.out.println ();
        int k = 3;

        if (k > num) {
            k = k % num;
        }

        reverseArray (0 , arr.length - 1 , arr);
        System.out.print ("After reverse our array is : ");
        for (int values : arr) {
            System.out.print (" " + values);
        }
        System.out.println ();

        reverseArray (0 , k - 1 , arr);
        System.out.print ("After reverse your array  K times is : ");
        for (int values : arr) {
            System.out.print (" " + values);
        }

        System.out.println ();


        reverseArray (k , arr.length - 1 , arr);
        System.out.print ("After reverse your array  K to arr.length  times is \t this is final answer : ");
        for (int values : arr) {
            System.out.print (" " + values);
        }
    }

    public static void copyReverse ( ) {
        int[] arr = new int[] {1 , 2 , 3};
        System.out.println ("your array");
        for (int val : arr) {
            System.out.println (val);
        }
        int length = arr.length;
        int[] rev = new int[length];

        for (int i = 0 ; i < arr.length ; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        System.out.println ("After copying element in reverse order");
        for (int values : rev) {
            System.out.println (
                    values
            );
        }
    }

    public static void ascendingOrderArray ( ) {
        int num = readInt ("enter the size of array");
        int[] arr = new int[num];

        System.out.println ("enter the values in the array ");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt ();
        }
        System.out.println ("before ascending your arrray is");
        for (int value : arr) {
            System.out.println (value);
        }
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println ("After ");
        for (int value : arr) {
            System.out.println (value);
        }
    }

    public static void descendingOrderArray ( ) {
        int num = readInt ("enter the size of array");
        int[] arr = new int[num];

        System.out.println ("enter the values in the array ");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt ();
        }
        System.out.println ("before descending your arrray is");
        for (int value : arr) {
            System.out.println (value);
        }
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println ("After ");
        for (int value : arr) {
            System.out.println (value);
        }
    }

    public static void main ( String[] args ) {
        while (true) {
            printMenu ();
            int choice = readInt ("Enter your choice (1-14):");

            switch (choice) {
                case 1 -> inputAndPrintArray ();
                case 2 -> findMinMax ();
                case 3 -> searchElement ();
                case 4 -> {
                    int num = readInt ("Enter the size of array ");
                    int[] arr = new int[num];
                    System.out.println ("Enter the value in the array");
                    for (int i = 0 ; i < arr.length ; i++) {
                        arr[i] = sc.nextInt ();
                    }
                    System.out.print ("After revers your array is => ");
                    reverseArray (0 , arr.length - 1 , arr);
                    for (int value : arr) {
                        System.out.print (" " + value);
                    }
                }
                case 5 -> findSecondMax ();
                case 6 -> generateFibonacci ();
                case 7 -> findMissingNumberMethod1 ();
                case 8 -> findMissingNumberMethod2 ();
                case 9 -> checkPalindrome ();
                case 10 -> findDuplicate ();
                case 11 -> findUniqueNumber ();
                case 12 -> rotateArray ();
                case 13 -> copyReverse ();
                case 14 -> ascendingOrderArray ();
                case 15 -> descendingOrderArray ();
                case 16 -> {
                    System.out.println ("Exiting program...");
                    return;
                }
                default -> System.out.println ("Invalid choice! Please enter 1-14.");
            }
            sc.nextLine ();
        }
    }

    private static void printMenu ( ) {
        System.out.println ("\n===== Array Operations Menu =====");
        System.out.println ("1. Input and Print Array");
        System.out.println ("2. Find Min and Max in Array");
        System.out.println ("3. Search Element in Array");
        System.out.println ("4. Reverse Array");
        System.out.println ("5. Find Second Maximum");
        System.out.println ("6. Generate Fibonacci Sequence");
        System.out.println ("7. Find Missing Number (Method 1)");
        System.out.println ("8. Find Missing Number (Method 2)");
        System.out.println ("9. Check if Array is Palindrome");
        System.out.println ("10. Find Duplicate Number");
        System.out.println ("11. Find Unique Number");
        System.out.println ("12. Rotate Array");
        System.out.println ("13. Copy Array in Reverse");
        System.out.println ("14. ascendingOrderArray");
        System.out.println ("15.descendingOrderArray ");
        System.out.println ("16. Exit");
        System.out.println ("===============================");
    }

}

