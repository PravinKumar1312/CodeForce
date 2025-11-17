import java.util.*;
import java.io.*;

public class TwoTeamsComposing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : a) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int unique = freq.size();
            int maxFreq = 0;
            for (int f : freq.values()) {
                maxFreq = Math.max(maxFreq, f);
            }

            int ans = Math.min(unique, maxFreq);
            if (unique == maxFreq) {
                ans--;
            }
            System.out.println(ans);
        }
    }
}