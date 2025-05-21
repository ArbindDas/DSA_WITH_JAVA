package DSA.BinarySearch;


import static DSA.Sorting.SelectionSort.printArray;

public class BinarySearchProblems {

    public static void searchKey() {
        int[]arr = new int[]{1,2,3,4,5,6};
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

    public static void findFirstAndLastPositionOfKey() {
        int[] arr = new int[]{5, 7, 7, 8, 8, 9};
        int key = 8;
        int first = -1, last = -1;

        // First Occurrence
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == key) {
                first = mid;
                end = mid - 1;  // Keep searching on the left
            } else if (arr[mid] < key) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Last Occurrence
        st = 0;
        end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == key) {
                last = mid;
                st = mid + 1;  // Keep searching on the right
            } else if (arr[mid] < key) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (first != -1) {
            System.out.println("The first key is present at index: " + first);
        } else {
            System.out.println("Key not found.");
        }

        if (last != -1) {
            System.out.println("The last key is present at index: " + last);
        } else {
            System.out.println("Key not found.");
        }
    }

    public static void main ( String[] args ) {

        searchKey ();
//        findFirstAndLastPositionOfKey ();
    }
}
