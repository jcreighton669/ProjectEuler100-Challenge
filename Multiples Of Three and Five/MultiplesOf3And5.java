public class MultiplesOf3And5 {
    public static void main(String[] args) {
        System.out.println(multiplesOf3and5(10));
    }
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
