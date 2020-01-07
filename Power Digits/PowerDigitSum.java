import java.util.Scanner;

public class PowerDigitSum  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter an integer exponent: ");
        int exponent = scanner.nextInt();
        System.out.println(digitSum(base, exponent));

    }

    /*
    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

    What is the sum of the digits of the number 2^1000?
     */

    public static int digitSum(double base, int exponent) {
        int powerDigits = (int)Math.pow(base, exponent);
        int sum = 0;
        int digit = 0;
        while (powerDigits != 0) {
            digit = powerDigits % 10;
            sum += digit;
            powerDigits /= 10;
        }
        return sum;
    }

}
