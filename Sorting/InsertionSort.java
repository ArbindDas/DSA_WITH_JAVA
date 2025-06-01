package DSA.Sorting;

import static DSA.Sorting.SelectionSort.printArray;

public class InsertionSort {
    public static void main ( String[] args ) {
            int []arr = new int[]{7,4,2,3,5};
            isInsertionSort (arr);

//        Algorithm        Best Case	Average Case	Worst Case
//        Insertion Sort 	O(n)	         O(n²)	    O(n²)
    }
    public static void isInsertionSort(int []arr){
        for (int i = 1 ; i < arr.length ; i++) {
            for (int j = i ; j > 0  ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }
        }
        printArray(arr);
    }
}
