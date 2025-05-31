package DSA.BinarySearch;

import java.util.*;


public class MediumBinarySearchProblems {

    public static void bookAllocationProblem() {

        int[] arr = new int[]{12, 34, 67, 90};
        int sum = Arrays.stream(arr).sum();
        int st = 90, end = sum, mid;
        int ans = 0;

        while ( st <= end ) {

            int pages = 0;
            int count = 0;
            count += 1;

            mid = st + (end - st) / 2;
            for ( int i = 0; i < arr.length; i++ ) {

                pages += arr[ i ];

                if (pages > mid) {
                    count++;
                    pages = arr[ i ];
                }
            }

            if (count <= 2) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        System.out.println("the maximum number of pages assigned to any student is " + ans);
    }

    public static void main(String[] args) {
//        bookAllocationProblem();




    }
}
