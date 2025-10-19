import java.util.*;
import java.io.*;

public class GameOfMathletes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
            }
            long ans = 0;
            for (int val : cnt.keySet()) {
                if (val * 2L < k) {
                    int other = cnt.getOrDefault(k - val, 0);
                    ans += Math.min(cnt.get(val), other);
                } else if (val * 2L == k) {
                    ans += cnt.get(val) / 2;
                }
            }
            System.out.println(ans);
        }
    }
}