package DSA.BinarySearch;


import static DSA.Sorting.SelectionSort.printArray;

public class BinarySearchProblmes {
    public static void searchKey(int []arr) {
        int size = arr.length;
        int key = 4;
        int start = 0, end = size - 1, mid;
        while (start <= end) {

            mid = (start+end)/2;
            if (arr[mid] == key){
                System.out.println ("the key is present at index : "+mid);
                break;
            }else if (arr[mid] < key) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

    }
    public static void main ( String[] args ) {
        int[]arr = new int[]{1,2,3,4,5};
        searchKey (arr);
    }
}
