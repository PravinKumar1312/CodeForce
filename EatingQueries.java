import java.util.*;
import java.io.*;

public class EatingQueries {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();

            Integer[] candies = new Integer[n];
            for (int i = 0; i < n; i++) {
                candies[i] = scanner.nextInt();
            }

            // Sort in descending order
            Arrays.sort(candies, Collections.reverseOrder());

            // Create prefix sum array
            long[] prefix = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + candies[i];
            }

            // Process queries
            for (int i = 0; i < q; i++) {
                int x = scanner.nextInt();

                // Binary search to find minimum k where prefix[k] >= x
                int left = 1, right = n;
                int ans = -1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (prefix[mid] >= x) {
                        ans = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                result.append(ans).append("\n");
            }
        }

        System.out.print(result);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}