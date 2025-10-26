import java.util.*;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int[] prefixDistinct = new int[n];
            int[] suffixDistinct = new int[n];

            // Compute prefix distinct counts
            boolean[] seenPrefix = new boolean[26];
            int distinctSoFar = 0;
            for (int i = 0; i < n; i++) {
                int idx = s.charAt(i) - 'a';
                if (!seenPrefix[idx]) {
                    seenPrefix[idx] = true;
                    distinctSoFar++;
                }
                prefixDistinct[i] = distinctSoFar;
            }

            // Compute suffix distinct counts
            boolean[] seenSuffix = new boolean[26];
            distinctSoFar = 0;
            for (int i = n - 1; i >= 0; i--) {
                int idx = s.charAt(i) - 'a';
                if (!seenSuffix[idx]) {
                    seenSuffix[idx] = true;
                    distinctSoFar++;
                }
                suffixDistinct[i] = distinctSoFar;
            }

            // Find maximum f(a) + f(b)
            int maxSum = 0;
            for (int i = 0; i < n - 1; i++) {
                maxSum = Math.max(maxSum, prefixDistinct[i] + suffixDistinct[i + 1]);
            }

            System.out.println(maxSum);
        }
        scanner.close();
    }
}