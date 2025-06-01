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
    public static void painterPartionProblem(){

        int arr[] = {5,10,30,20,15};
        int k = 3;
        int n  = arr.length;
        OptionalInt max = Arrays.stream(arr).max();
        int start = max.getAsInt();
        int sum  = Arrays.stream(arr).sum();

        int end = sum , mid = 0;


        int ans = 0;
        if (k>n){
            System.out.println("can't do this minimize your painter "+k);
            return;
        }
        while ( start<=end ) {
            int pages = 0;
            int count = 0;
            count += 1;

            mid = start+(end-start)/2;

            for ( int i = 0; i < n; i++ ) {

                pages += arr[i];


                if (pages > mid){
                    count++;
                    pages = arr[i];
                }
            }
            if (count<=k){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        System.out.println(ans);
    }


    public static void shipPackages(){

        int []arr = {3,2,2,4,1,4};

        int end = Arrays.stream(arr).sum();
        OptionalInt fMax = Arrays.stream(arr).max();
        int start = fMax.getAsInt();
        int n = arr.length;

        int days = 3;

        if (days>n){
            System.out.println("can't do this minimize your shipping days "+days);
            return;
        }

        int mid , ans = 0;

        while ( start<=end ){

            int count = 0;
            int pages = 0;

            count+=1;

            mid = start+(end-start)/2;

            for ( int i = 0; i < n; i++ ) {

                pages+=arr[i];

                if (pages >mid){
                    count++;
                    pages = arr[i];
                }
            }

            if (count<=days){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
//            bookAllocationProblem();
//            painterPartionProblem();
//            shipPackages();
    }

}
