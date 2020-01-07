import java.util.Scanner;

public class LargestPalindromicProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of digits for multiplier: ");
        int digits = scanner.nextInt();

        int firstValue = 0;
        int secondValue = 0;
        int product = 0;
        int palindromicProduct = 0;
        for (int i = (int)Math.pow(10, digits-1); i < (int)Math.pow(10, digits); i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;
                if (isPalindrome(product) && product > palindromicProduct) {
                    firstValue = i;
                    secondValue = j;
                    palindromicProduct = product;
                }
            }
        }
        System.out.println(firstValue + " * " + secondValue + " = " + palindromicProduct);
    }


    public static boolean isPalindrome(int prod) {
        int remainder = 0;
        int reversedProd = 0;
        int temp = prod;
        boolean palindrome = false;
        while (temp != 0) {
            remainder = temp % 10;
            reversedProd = reversedProd * 10 + remainder;
            temp /= 10;
        }

        if (prod == reversedProd) {
            palindrome = true;
        }
        return palindrome;
    }
}
