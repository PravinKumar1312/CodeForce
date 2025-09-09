import java.util.*;
import java.io.*;

public class MaximumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long[] arr = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(arr);
            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + arr[i];
            }

            long maxSum = 0;
            for (int x = 0; x <= k; x++) {
                int start = 2 * x;
                int end = n - 1 - (k - x);
                long currentSum = pref[end + 1] - pref[start];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            sb.append(maxSum).append("\n");
        }
        System.out.print(sb);
    }
}