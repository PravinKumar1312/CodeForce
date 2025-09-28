import java.io.*;
import java.util.*;

public class SakurakoFieldTrip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // Count frequencies of numbers
            int[] freq = new int[n + 1];
            for (int num : arr) {
                freq[num]++;
            }

            // Find the maximum frequency
            int maxFreq = 0;
            for (int i = 1; i <= n; i++) {
                maxFreq = Math.max(maxFreq, freq[i]);
            }

            // If maximum frequency is more than half, we need to handle differently
            if (maxFreq > (n + 1) / 2) {
                // The best we can do is to separate as much as possible
                // The minimal disturbance will be 2 * maxFreq - n - 1
                sb.append(Math.max(0, 2 * maxFreq - n - 1)).append("\n");
            } else {
                // We can arrange so that no two same elements are adjacent
                // The minimal disturbance is max(0, n % 2)
                // For even n: 0, for odd n: we might have 1 if arrangement is not perfect
                int result = (n % 2 == 1) ? 1 : 0;

                // Check if we can actually achieve 0 for odd length
                if (n % 2 == 1) {
                    // For odd length, if any number appears more than n/2 times, we might have
                    // disturbance
                    boolean canArrange = true;
                    for (int i = 1; i <= n; i++) {
                        if (freq[i] > n / 2) {
                            canArrange = false;
                            break;
                        }
                    }
                    if (canArrange) {
                        result = 0;
                    } else {
                        result = 1;
                    }
                }
                sb.append(result).append("\n");
            }
        }

        System.out.print(sb);
    }
}