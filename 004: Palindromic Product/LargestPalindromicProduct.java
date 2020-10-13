import java.util.Scanner;

public class LargestPalindromicProduct {
	/*
	 * A palindromic number reads the same both ways. The largest palindrome made
	 * from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of digits for multiplier: ");
		int digits = scanner.nextInt();
		int count = 0;
		int firstValue = 0;
		int secondValue = 0;
		int product = 0;
		int palindromicProduct = 0;
		for (int i = (int) Math.pow(10, digits - 1); i < (int) Math.pow(10, digits); i++) {
			for (int j = (int) Math.pow(10, digits - 1); j < (int) Math.pow(10, digits); j++) {
				product = i * j;
				if (isPalindrome(product)) {
					count++;
					firstValue = i;
					secondValue = j;
					palindromicProduct = product;
				}
			}
		}
		System.out.println(firstValue + " * " + secondValue + " = " + palindromicProduct);
		System.out.println(count);
		scanner.close();
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
