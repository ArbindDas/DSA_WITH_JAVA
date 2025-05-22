package DSA.Sorting;
import static DSA.Sorting.SwapClass.isSwap;
public class SelectionSort {
    public static void printArray(int[]arr){
        for (int value : arr) {
            System.out.println (value);
        }
    }
    public static void  isSelectionSort(int []arr){
        for (int i = 0 ; i < arr.length ; i++) {
                int minIndex = i;
            for (int j = i+1 ; j <  arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray (arr);
    }
    public static void main ( String[] args ) {
        int [] arr = new int[]{4,5,3,2,1};
        isSelectionSort (arr);
        //        Algorithm        Best Case	Average Case	Worst Case
//             selection Sort 	O(n)	         O(n²)	    O(n²)
    }
}
