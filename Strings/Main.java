package DSA.Strings;

public class Main {

    public static String reverse(String input){

        StringBuilder reverseString = new StringBuilder();

        for ( int i = input.length()-1; i >=0 ; i-- ) {

            reverseString.append( input.charAt( i ) );
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {

        String ans = reverse( "hello" );
        System.out.println(ans);
    }
}
