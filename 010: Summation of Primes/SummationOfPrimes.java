import java.util.Scanner;

public class SummationOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an upper limit: ");
        int n = scanner.nextInt();
        System.out.println(primes(n));
    }

    public static int primes(int n) {
        // Create a simple array that holds boolean values.
        boolean[] prime = new boolean[n + 1];
        int sum = 0;

        // Set all values in the array to true.
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        /* Test the numbers less than the limit for prime and convert
        non-primes to false.
         */
        for (int p = 2; p*p < n; p++) {
            if (prime[p] == true) {
                for (int i = p*2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Sum the indexes of prime numbers
        for (int i = 2; i <=n ; i++) {
            if (prime[i] == true) {
                sum += i;
            }
        }

        return sum;
    }
}
