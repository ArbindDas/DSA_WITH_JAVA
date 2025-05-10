package DSA.LinearSearch;

public class printArray
{
    public static int[] print(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.println (arr[i] );
        }
        return arr;
    }
    public static void main ( String[] args ) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        print ( arr );
    }
}
