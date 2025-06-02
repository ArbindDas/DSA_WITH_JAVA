package DSA.BinarySearch;

public class HardLevelProblems {

    // Insertion Sort to sort the array
    private static void insertionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
//        printArray(arr);
    }


    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    private static void aggressiveCow() {
        int[] arr = new int[]{10, 1, 2, 7, 5};
        insertionSorting(arr);

        int n = arr.length;
        int start = arr[0];
        int end = arr[n - 1] - arr[0];
        int mid, ans = 0;
        int k = 3;

        while (start <= end) {
            mid = start + (end - start) / 2;

            int count = 1;
            int pos = arr[0];

            for (int i = 1; i < n; i++) {
                if (arr[i] - pos >= mid) {
                    count++;
                    pos = arr[i];
                }
            }

            if (count < k) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }

        System.out.println("The largest minimum distance is => " + ans);
    }

    public static void main(String[] args) {
        aggressiveCow();
    }
}
