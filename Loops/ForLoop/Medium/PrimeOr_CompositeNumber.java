    package DSA.Loops.ForLoop.Medium;

    import java.util.Scanner;

    public class PrimeOr_CompositeNumber
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of n : ");
            int n = sc.nextInt();

            printPrimeCom(n);

        }

        private static void printPrimeCom(int n) {
            if (n == 1) {
                System.out.println(n + " is neither prime nor composite.");
                return;
            }
            boolean isPrime = true; // Assume the number is prime
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(n + " is the prime number : ");
            }else {
                System.out.println(n + " is the composite number : ");
            }
        }
    }
