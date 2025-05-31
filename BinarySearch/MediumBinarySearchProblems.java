package DSA.BinarySearch;

import java.util.*;


public class MediumBinarySearchProblems {

    public static void bookAllocationProblem() {

        int[] arr = new int[]{12, 34, 67, 90};
        int m = 2;

        int n = arr.length;
        int sum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().getAsInt();
        int st = max, end = sum, mid;
        int ans = 0;

        if (m > n){
            System.out.println("can't do this minimize your student "+m);
            return;
        }

        while ( st <= end ) {

            int pages = 0;
            int count = 0;
            count += 1;

            mid = st + (end - st) / 2;
            for ( int i = 0; i < n; i++ ) {

                pages += arr[ i ];

                if (pages > mid) {
                    count++;
                    pages = arr[ i ];
                }
            }

            if (count <= m) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        System.out.println("the maximum number of pages assigned to any student is " + ans);
    }

    public static void main(String[] args) {
            bookAllocationProblem();
    }
}
