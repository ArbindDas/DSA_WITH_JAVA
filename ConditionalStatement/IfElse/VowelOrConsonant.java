package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        System.out.println ("Enter ta single character ....." );

        char ch = scanner.nextLine ().toLowerCase (  ).charAt ( 0 );

        if (!Character.isLetter ( ch )){
            System.out.println("Not a valid letter.");
        }else if ("aeiou".indexOf ( ch )!=-1){
            System.out.println(ch + " is a vowel.");
        }else {
            System.out.println(ch + " is a consonant.");
        }
        scanner.close();
    }
}
