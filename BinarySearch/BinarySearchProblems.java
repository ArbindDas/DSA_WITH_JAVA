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

    public static void findTheOcc() {
        int[] arr = new int[]{2, 3, 5, 7, 7, 7, 7};
        int target = 7;

        int first = -1, last = -1;
        int st = 0, end = arr.length - 1, mid;

        while (st <= end) {
            mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        st = 0;
        end = arr.length - 1;


        while (st <= end) {
            mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                last = mid;
                st = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        if (first != -1 && last != -1) {
            int count = last - first + 1;
            System.out.println("The target value occurred: " + count + " times");
        } else {
            System.out.println("Target not found");
        }
//        count = last - first + 1
    }


    public static void findMinRotatedArray(){
        int[] arr = {4, 5, 6, 7, 1, 2};
        int st = 0, end = arr.length - 1, mid;
        int min = arr[0];
        while (st<=end) {
            mid = st+(end-st)/2;

            if (arr[mid] < min){
                min = arr[mid];
                end = mid -1;
            } else if (arr[mid] > min) {
                st = mid + 1;
            }else {
                end = mid -1;
            }
        }
        System.out.println(min);
    }


    public static void searchInRotatedArray(){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int st = 0, end = arr.length - 1, mid;
        int target = 2;
        int ans = -1;
        while (st<=end){

            mid = st+(end-st)/2;
            if (arr[mid] == target){
                ans = mid;
                break;
            }
            // left side sorted
            else if (arr[mid] > arr[0]) {
                if ((arr[st]<=target)&& arr[mid]>=target){
                    end = mid -1;
                }else {
                    st = mid + 1;
                }
            }
            // right side sorted
            else {
                if (arr[mid]<=target && arr[end]>=target){
                        st = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        if (ans!=-1){
            System.out.println(ans);
        }

    }

    public static void findKthMissingPosNumber(){
        int []arr = {2,3,4,7,11,12};
        int k = 5;
        int st = 0 , end = arr.length-1 , ans = arr.length , mid;

        while (st<=end){

            mid = st+(end-st)/2;

            if (arr[mid]-mid-1 >= k){
                ans = mid;
                end = mid -1;
            }else {
                st  = mid + 1;
            }
        }

        int fAns = ans + k;
        System.out.println("the kth postive missing number is : "+fAns);
    }
    public static void main ( String[] args ) {

//        searchKey ();
//        findFirstAndLastPositionOfKey ();
//        searchInsertPosition();
        sqrtBinarySearch (10);
//        PeakMountainProblem();
//        findTheOcc();
//       findMinRotatedArray();
//        searchInRotatedArray();
//        findKthMissingPosNumber();
    }
}
