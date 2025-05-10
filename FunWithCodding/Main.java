package DSA.FunWithCodding;

import java.util.Arrays;

public class Main
{
    public static void main ( String[] args ) {

    }

    public static int addAllNumbers(int... numbers){
        return Arrays.stream ( numbers ).reduce ( 0  , Integer::sum );
    }

    public static int addAllNums(int... num){

        if (num.length < 2){
            System.out.println("Please enter at least two numbers.");
            return 0;
        }
        int sum = 0;
        for (int n : num){
            sum+=n;
        }
        return sum;
    }

}
