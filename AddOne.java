import java.util.*;

public class AddOne {
    static final int MOD = 1000000007;
    static final int MAX = 200010;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] dp = new long[MAX];
        for (int i = 0; i < 9; i++) {
            dp[i] = 2;
        }
        dp[9] = 3;

        for (int i = 10; i < MAX; i++) {
            dp[i] = (dp[i - 9] + dp[i - 10]) % MOD;
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int m = sc.nextInt();

            long ans = 0;
            for (char c : n.toCharArray()) {
                int digit = c - '0';
                if (m < 10 - digit) {
                    ans += 1;
                } else {
                    ans = (ans + dp[m - (10 - digit)]) % MOD;
                }
            }
            System.out.println(ans % MOD);
        }
        sc.close();
    }
}