import java.util.*;

public class NegativesAndPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            int negativeCount = 0;
            long sumAbsolute = 0;
            long minAbsolute = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] < 0) {
                    negativeCount++;
                }
                long absolute = Math.abs(arr[i]);
                sumAbsolute += absolute;
                minAbsolute = Math.min(minAbsolute, absolute);
            }

            if (negativeCount % 2 == 0) {
                // Even number of negatives - can eliminate all negatives
                System.out.println(sumAbsolute);
            } else {
                // Odd number of negatives - will have one negative left
                // Put it on the smallest absolute value to minimize loss
                System.out.println(sumAbsolute - 2 * minAbsolute);
            }
        }
        sc.close();

    }
}