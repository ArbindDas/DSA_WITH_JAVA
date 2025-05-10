    package DSA.ConditionalStatement.SwitchStatement;
    import java.util.Scanner;
    public class ATM_Operations {
        private static double accountBalance = 0;
        private static Scanner sc = new Scanner(System.in);

        private static double readDouble(String prompt) {
            System.out.println (prompt );
            while (true) {
                try {
                    return Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }

        private static int readInt(String  prompt) {
            System.out.println (prompt );
            while (true) {
                try {
                    return Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        public static void withdraw() {
            double amount = readDouble("Enter the amount you want to withdraw: ");

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
                return;
            }

            if (amount > accountBalance) {
                System.out.println("Insufficient funds. Your balance is: " + accountBalance);
            } else {
                accountBalance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + accountBalance);
            }
        }

        public static void deposit() {
            double amount = readDouble("Enter the amount you want to deposit:");

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
                return;
            }

            accountBalance += amount;
            System.out.println("Deposit successful. Current balance: " + accountBalance);
        }

        public static void checkBalance() {
            System.out.println("Your current balance is: " + accountBalance);
        }


        public static void showMenu()
        {
            while (true) {
                System.out.println("\nWelcome to the ATM Machine");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");


                int choice = readInt("Enter your choice:");

                switch (choice) {
                    case 1:
                        withdraw();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        public static void main(String[] args) {
          showMenu ();
        }
    }