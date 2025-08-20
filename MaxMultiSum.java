import java.util.Scanner;

public class MaxMultiSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int bestX = 2;
            long maxSum = 0;
            for (int x = 2; x <= n; x++) {
                int k = n / x;
                long sum = (long) x * k * (k + 1) / 2;
                if (sum > maxSum) {
                    maxSum = sum;
                    bestX = x;
                }
            }
            System.out.println(bestX);
        }
        scanner.close();
    }
}