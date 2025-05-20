package DSA.Sorting;

import static DSA.Sorting.SelectionSort.printArray;
import static DSA.Sorting.SwapClass.isSwap;

public class BubbleSort {
    public static void isBubbleSort(int []arr){
        boolean isSwapped;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            isSwapped = false;
            for (int j = 0 ; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
        printArray (arr);
    }
    public static void main ( String[] args ) {
       int []arr = new int[]{89 ,  34 , 1 , 4};
        isBubbleSort(arr);
    }
}
