import java.util.Scanner;

public class NthPrime {

    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
    that the 6th prime is 13.

    What is the nth prime number?
     */
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which prime you want: ");
        int nth = scanner.nextInt();
        int nthPrime = 0;

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                nthPrime = i;
            }
            if (count == nth) {
                break;
            }
        }
        System.out.println(nthPrime);
    }
}
