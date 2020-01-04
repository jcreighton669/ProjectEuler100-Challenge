public class MultiplesOf3And5 {
    public static void main(String[] args) {
        System.out.println(multiplesOf3and5(10));
    }
    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5,
    we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below the provided parameter
    value number.
     */
    public static long multiplesOf3and5(int number) {
        long sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
