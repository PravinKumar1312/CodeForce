import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgainstTheDiff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, pw);
        }
        pw.flush();
    }

    private static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] a = new int[n];
        Map<Integer, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(line[i]);
            pos.putIfAbsent(a[i], new ArrayList<>());
            pos.get(a[i]).add(i);
        }

        long[] dp = new long[n + 1];
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            int val = a[i - 1];

            counts.put(val, counts.getOrDefault(val, 0) + 1);
            int count = counts.get(val);

            if (count >= val) {
                int prev_idx = pos.get(val).get(count - val);
                long newLen = dp[prev_idx] + val;
                dp[i] = Math.max(dp[i], newLen);
            }
        }
        pw.println(dp[n]);
    }
}