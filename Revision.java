package DSA;

import javax.security.sasl.SaslClient;

import java.util.Scanner;

import static DSA.Sorting.SelectionSort.printArray;

public class Revision {

    public static void selectionSorting(){
        int []arr = {5,2,8,1,3};
        int n = arr.length;
        for ( int i = 0; i < n-1; i++ ) {

            int min = i;

            for ( int j = i+1; j < n; j++ ) {
                if (arr[j] < arr[ min ]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        System.out.print("After sorting your array ");
        printArray(arr);
    }


    public static void bubbleSorting(){
        int []arr = {5,2,8,1,3};
        int n = arr.length;

        for ( int i = 0; i < n-1; i++ ) {

            boolean swapped = false;

            for ( int j = 0; j < n-1-i; j++ ) {
                if (arr[j] > arr[ j+1 ]){
                    swapped  = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  = temp;
                }
            }
            if (!swapped) break;

        }
        System.out.print("After sorting your array ");
        printArray(arr);
    }

    public static void insertionSorting(){

        int []arr = {5,2,8,1,3};
        int n = arr.length;


        for ( int i = 1; i < n; i++ ) {

            for ( int j = i; j >0; j-- ) {

                if (arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.print("After sorting your array ");
        printArray(arr);
    }

  public static void main(String[] args) {
//        selectionSorting();
//        bubbleSorting();
//        insertionSorting();
    }
}
