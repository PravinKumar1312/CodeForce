import java.io.*;
import java.util.*;

public class MKTower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[][] dp = new int[n + 3][2];

            // Initialize with large values
            for (int i = 0; i <= n + 2; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
            }

            // Base cases
            dp[n + 1][0] = 0;
            dp[n + 1][1] = 0;

            for (int i = n; i >= 1; i--) {
                for (int player = 0; player < 2; player++) {
                    if (player == 0) { // Friend's turn
                        // Kill 1 boss
                        dp[i][0] = Math.min(dp[i][0], dp[i + 1][1] + a[i]);
                        // Kill 2 bosses
                        if (i + 1 <= n) {
                            dp[i][0] = Math.min(dp[i][0], dp[i + 2][1] + a[i] + a[i + 1]);
                        }
                    } else { // Your turn
                        // Kill 1 boss
                        dp[i][1] = Math.min(dp[i][1], dp[i + 1][0]);
                        // Kill 2 bosses
                        if (i + 1 <= n) {
                            dp[i][1] = Math.min(dp[i][1], dp[i + 2][0]);
                        }
                    }
                }
            }

            System.out.println(dp[1][0]);
        }
    }
}