package DSA.Sorting;

import static DSA.Sorting.SelectionSort.printArray;

public class InsertionSort {
    public static void main ( String[] args ) {
            int []arr = new int[]{45, 3, 2 , 5};
            isInsertionSort (arr);
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
