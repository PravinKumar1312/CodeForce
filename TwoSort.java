import java.io.*;
import java.util.*;

public class TwoSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            int consecutiveValid = 0;

            // Check for each position if a[i] < 2 * a[i+1]
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < 2 * a[i + 1]) {
                    consecutiveValid++;
                } else {
                    consecutiveValid = 0;
                }

                // If we have at least k consecutive valid pairs starting from i-k+1 to i,
                // then the subarray from i-k+1 to i+1 has length k+1 and satisfies the
                // condition
                if (consecutiveValid >= k) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}