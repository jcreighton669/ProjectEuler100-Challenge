import java.util.Scanner;

    /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for
    which,

    a^2 + b^2 = c^2

    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc such that a + b + c = n.
     */
public class PythagoreanProduct {
    public static void main(String[] args) {
        int c = 0;
        int a = 0;
        int b = 0;
        int pythagProduct = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            for (int j = i; j < num; j++) {
                c = num - (i + j);
                if (c > a && c > b) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(c, 2)) {
                        pythagProduct = i * j * c;
                        a = i;
                        b = j;
                    }
                }
            }
        }
        System.out.println(pythagProduct);
    }
}
