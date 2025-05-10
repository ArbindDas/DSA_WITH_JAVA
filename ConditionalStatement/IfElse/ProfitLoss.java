package DSA.ConditionalStatement.IfElse;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cp price : ");
        int cp = sc.nextInt();
        System.out.println("Enter the sp price : ");
        int sp = sc.nextInt();

        isProfitOrLoss(cp, sp);
    }

    public static void isProfitOrLoss(int cp, int sp) {
        if (sp > cp) {
            System.out.printf("we are in profit : ");
            System.out.println(sp-cp);
        } else {
            System.out.printf("we are in Loss : ");
            System.out.println(cp-sp);
        }
    }
}
