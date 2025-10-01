import java.io.*;

public class UnstableString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            int n = s.length();
            long[][] dp = new long[n][2];

            // Base case
            if (s.charAt(0) == '0') {
                dp[0][0] = 1;
            } else if (s.charAt(0) == '1') {
                dp[0][1] = 1;
            } else {
                dp[0][0] = 1;
                dp[0][1] = 1;
            }

            long ans = Math.max(dp[0][0], dp[0][1]);

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '0') {
                    dp[i][0] = dp[i - 1][1] + 1;
                } else if (s.charAt(i) == '1') {
                    dp[i][1] = dp[i - 1][0] + 1;
                } else {
                    dp[i][0] = dp[i - 1][1] + 1;
                    dp[i][1] = dp[i - 1][0] + 1;
                }
                ans += Math.max(dp[i][0], dp[i][1]);
            }

            System.out.println(ans);
        }
    }
}