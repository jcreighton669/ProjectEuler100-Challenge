import java.util.ArrayList;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        factors(13195);

    }
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.
    
    What is the largest prime factor of the given number?
     */

    public static void factors(int number) {
        int largestPrime = 0;
        ArrayList<Integer> factors = new ArrayList<>();


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        for (int i = 0; i < factors.size(); i++){
            if (isPrime(factors.get(i)) && factors.get(i) > largestPrime) {
                largestPrime = factors.get(i);
            }

        }
        System.out.println(largestPrime);
    }

    public static boolean isPrime(int factor) {
        boolean prime = true;
        int i = 2;
        while (i < factor) {
            if (factor % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        return prime;
    }
}
