public class FactorialDigitSum {

    /*
    n! means n × (n − 1) × ... × 3 × 2 × 1

    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
    and the sum of the digits in the number
    10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

    Find the sum of the digits n!
     */

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(sumFactorialDigits(factorial(10)));
    }

    public static int factorial(int number){
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int sumFactorialDigits(int factorial) {
        int sum = 0;
        int temp = 0;
        while (factorial != 0) {
            temp = factorial % 10;
            sum += temp;
            factorial /= 10;
        }
        return sum;
    }
}
