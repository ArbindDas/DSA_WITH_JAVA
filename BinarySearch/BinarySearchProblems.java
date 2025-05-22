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

    public static void searchInsertPosition(){
        int[] arr = new int[]{4,5,8,11,13};
        int key = 6;
        int st = 0 , end = arr.length-1;
        int index = 0;
        int mid;
        while (st<=end){
            mid = (st+end)/2;
            if (arr[mid] == key){
                index  = mid;
            }
            else if (arr[mid] < key) {
                st = mid + 1;
            }
            else if (arr[mid] > key) {
                index  = mid;
                end = mid - 1;
            }
        }
        System.out.println ("the key is present at index : "+index);
    }


    public static void sqrtBinarySearch(int x) {
        int st = 0, end = x, ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (mid * mid == x) {
                ans = mid;
                break;
            } else if (mid * mid < x) {
                ans = mid; // Store potential answer
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Square root (integer part) of " + x + " is: " + ans);
    }

    public static void PeakMountainProblem(){
        int[]arr = new int[]{2,4,6,8,10,8,5};
        int st = 1 , end = arr.length-2 , mid;
        while (st<=end){
            mid = st+(end-st)/2;
            if ((arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])){
                System.out.println ("the peak mountain index is present at : "+mid );
                break;
            }else if (arr[mid] < arr[mid-1]){
                        end = mid - 1;
            }else if (arr[mid] > arr[mid-1]) {
                        st = mid + 1;
            }
        }
//        int st = 1;                      // Second element
//        int end = arr.length - 2;       // Second-to-last element

//
//        This guarantees that arr[mid - 1] and arr[mid + 1] are always valid.
//                Because in a valid mountain array, the peak is never at index 0 or n - 1 — the
//        array must go up then down, and the peak must be somewhere in the middle.
    }

    public static void main ( String[] args ) {

//        searchKey ();
//        findFirstAndLastPositionOfKey ();
//        searchInsertPosition();
//        sqrtBinarySearch (10);
//        PeakMountainProblem();
    }
}
