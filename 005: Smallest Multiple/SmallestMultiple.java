import java.util.Scanner;

public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxLCM = 1;

        System.out.print("Enter an integer: ");
        double range = scanner.nextInt();

        for (double i = 2; i <= range; i++) {
            maxLCM = leastCommonMultiple(maxLCM, i);
        }
        System.out.println((int)maxLCM);
    }

    /*
    2520 is the smallest number that can be divided by each of the numbers from
    1 to 10 without any remainder.
    
    What is the smallest positive number that is evenly divisible by all of the
    numbers from 1 to n?
     */
    
    public static double leastCommonMultiple(double a, double b) {
        return (a * b) / greatestCommonDenominator(a, b);
    }

    public static double greatestCommonDenominator(double a, double b) {
        if (b == 0) {
            return a;
        }
        else {
            return greatestCommonDenominator(b, a % b);
        }
    }
}
