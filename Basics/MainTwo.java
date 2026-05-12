package DSA.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTwo {


    public static void problem1(int number){
        if (number <=0) {
            System.out.printf("please enter the valid number or gt then "+ number);
            return;
        } else if (number%2==0) {
            System.out.printf("this is even number"+ number);
        }else {
            System.out.printf("the entered number is  odd: "+number);
        }
    }
    
    public static void question2(int number){

         if (number>0) {
            System.out.println("it is positive number "+ number);
        } else if (number<0) {
            System.out.println("it is a negative number" + number) ;
        } else {
            System.out.println("the entered number is " + number);
        }
    }


    public static void question3(int a , int b , int c){

        if (a>b && a>c){
            System.out.println("the greatest number is :"+ a);
        } else if (b>a && b>c) {
            System.out.println("the greatest number is :"+ b);
        } else if (c>a && c>b) {
            System.out.println("the greatest number is :"+ c);
        }

    }
    
    
    public static void question4(int year){
        if (year % 400 ==0){
            System.out.println("it is leap year" + year);
        } else if (year % 4 == 0 && year % 100 !=0) {
            System.out.println(" leap year "+ year);
        } else {
            System.out.println("not leap year "+ year);
        }
    }

    public  static  void calculateGrade(int percentage){
        if (percentage>=90 && percentage<=100){
            System.out.println("A+");
        } else if (percentage>=80 && percentage<=90) {
            System.out.println("A");
        } else if (percentage>=70 && percentage<=80) {
            System.out.println("B+");
        } else if (percentage>=60 && percentage<=70) {
            System.out.println("B");
        } else if (percentage>=50 && percentage<=60) {
            System.out.println("C+");
        } else if (percentage>=40 && percentage<=50) {
            System.out.println("C");
        } else if (percentage>=30 && percentage<=40) {
            System.out.println("JUST PASS");
        }else {
            System.out.println("tohar sudhree ke chance naikhee labour ma jaaa");
        }
    }

    public  static  void question5(int mathMarks, int scienceMarks , int englishMarks, int nepaliMarks, int computerMarks){
        int obtainMarks = mathMarks + scienceMarks + englishMarks + nepaliMarks + computerMarks;
        int totalMarks = 500;
        int percentage = (obtainMarks * 100)/totalMarks;
        System.out.println("the student total marks is "+ totalMarks);
        System.out.println("the student total percentage is "+ percentage);
        calculateGrade(percentage);
    }

    public static  void  validationSystem(String username , String password){

        if (username == null || username.isBlank()){
            System.out.println("please enter a valid nusernmae");
        }

        if (password == null || password.isBlank()){
            System.out.println("please enter a valid password");
        }
    }


    public static void question7(int number){

        if (number % 3== 0 && number % 5 ==0){
            System.out.println("the number is divisible by both 3 and 5  => "  + number);
        }else {
            System.out.println("the number is not divisible by 3 and 5 => "+ number);
        }
    }

    public static  void  question6(char ch){

//        if (
//                ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u'||
//                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch=='U'
//
//        ){
//            System.out.println("this is vowerl letters :" + ch );
//        }else {
//            System.out.println("consunant "+ ch);
//        }

        String vowels = "aeiouAEIOU";




        if (vowels.indexOf(vowels)!=-1){
            System.out.println("Vowel : "+ ch);
        }else {
            System.out.println("Consonant : "+ch);
        }
    }

    private static void condition(){
        System.out.println("1 . check the balance");
        System.out.println("2. withdraw the balance");
        System.out.println("3. add the balance");
        System.out.println("4 . Show all Transaction History");
        System.out.println("5 . Exit from the ATM");
    }
    public static void miniATM(){
        int bankBalance = 0;

        ArrayList<String> transactionHistory = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        int n;


        while (true){
             condition();
            System.out.println("Enter the case ");
             n = sc.nextInt();
            switch (n){


                case  1 -> {
                    if (bankBalance<=0) {
                        System.out.println("your bank balance is EMPTY please ADD some money");
                        System.out.println("bankBalance = " + bankBalance);
                    }else {
                        System.out.println("bankBalance is = "+ bankBalance );
                    }

                    // show last 3 transactions when checking balance
                    System.out.println("\n--- Recent Transactions ---");
                    if (transactionHistory.isEmpty()){
                        System.out.println("no transaction yet");
                    }else {
                        int start = Math.max(0, transactionHistory.size() - 3);
                            for (int i = start; i<transactionHistory.size(); i++){
                                System.out.println(transactionHistory.get(i));
                            }
                    }
                    System.out.println("---------------------------\n");
                }
                case 2 -> {
                    System.out.println("Enter the amount to be withdraw");
                    int withdraw = sc.nextInt();

                    if (bankBalance>=withdraw){
                        bankBalance-=withdraw;
                        transactionHistory.add("withdraw : ₹ "+ withdraw + " Remaining: ₹" + bankBalance);
                        System.out.println("The amount withdraw from bank is : " + withdraw);
                        System.out.println("After the amount withdraw the balance is => " + bankBalance);
                    }else{
                        if (bankBalance<=withdraw){
                            int mustWithdraw = withdraw - bankBalance;
                            System.out.println("the account balance is : "+ bankBalance +
                                    " but you want to  withdraw the amount is " + withdraw + " so if you withdraw less then  "
                                    + mustWithdraw + " then the balance is withdraw");

                        }
                        System.out.println("please first add some money to the bank account or withdraw lees or first check your balance");
                        transactionHistory.add("failed : tried to withdraw ₹ " + withdraw + " had only ₹" + bankBalance);
                    }


                }

                case 3 -> {
                    System.out.println("Enter the amount to be add in bank");
                    int amount = sc.nextInt();

                    bankBalance+=amount;
                    // add in arrayList
                    transactionHistory.add("Deposited ₹" + amount + " new Balance "+ bankBalance);
                    System.out.println("the amount added is : "+ amount);
                    System.out.println("After the amount added the bank balance is : "+ bankBalance);
                }


                case 4 -> {
                    System.out.println("final transaction history");
                    if (transactionHistory.isEmpty()){
                        System.out.println("All transactions");
                    }else {
                        for (int i = 0; i<transactionHistory.size(); i++){
                            System.out.println((i+1) + ". " + transactionHistory.get(i));
                        }
                        System.out.println("total transactions : "+ transactionHistory.size());
                        System.out.println("----------------------------------------");
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("Current Balance: ₹" + bankBalance);


                }
                case  5 -> {
                    System.out.println("Exiting....");
                    return;
                }

                default -> {
                    System.out.println("please enter the valid case ");
                }

            }
        }
    }


    public static void main(String[] args) {

        validationSystem("   " , "111111");
//        problem1(5);
//        question2(0);
//        question3(5, 17, 10);
//        question4(1900);
//        question5(90, 88 , 78 , 87, 78);
//        question6('A');
//        question7(15);
        miniATM();


        String sr = "abc";
        String[] s = sr.split("");
        for (int i = 0; i <sr.length() ; i++) {
//            System.out.println(sr.charAt(i));
            System.out.println(s[i]);
        }
//        ⚡ Difference between both methods
//        Method	Use case	                               Performance
//        charAt()	best for character processing	           fast ✔
//        split("")	string → array conversion	               slightly heavier


//        int n = 3;
//
//        if((n & 1) ==0){
//            System.out.println("even" + n);
//        }else {
//            System.out.println("Odd"+ n);
//        }
    }
}
