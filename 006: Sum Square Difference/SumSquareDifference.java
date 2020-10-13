import java.util.Scanner;

public class SumSquareDifference {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		sumDifference(number);
		scanner.close();
	}
	/*
	 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... +
	 * 10^2 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
	 * 10)^2 = 552 = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten natural
	 * numbers and the square of the sum is 3025 − 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred
	 * natural numbers and the square of the sum.
	 */

	public static void sumDifference(int length) {
		int[] firstArray = new int[length];
		int[] sencondArray = new int[length];
		int j = 0;
		int firstSum = 0;
		int secondSum = 0;
		for (int i = 0; i < firstArray.length; i++) {
			j = i + 1;
			firstArray[i] = j;
			sencondArray[i] = j * j;
		}

		for (int item : firstArray) {
			firstSum += item;
		}
		int firstProduct = firstSum * firstSum;
		for (int value : sencondArray) {
			secondSum += value;
		}
		System.out.println(firstProduct - secondSum);
	}
}