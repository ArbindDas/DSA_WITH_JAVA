package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class AbsoluteIntegerNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num  = sc.nextInt();
        int ans = isAbsoluteInteger(num);
        System.out.println(ans);
    }
    public static int isAbsoluteInteger(int num){
       if (num<0){
           System.out.printf("the absloute num  of " +num + " is = " );
         return   num*-1;
       }else {
           return num;
       }
    }

}
