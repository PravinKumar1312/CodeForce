import java.io.*;
import java.util.*;

public class InaccurateSubsequenceSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            // Frequency map for b
            Map<Integer, Integer> freqB = new HashMap<>();
            for (int num : b) {
                freqB.put(num, freqB.getOrDefault(num, 0) + 1);
            }

            // Frequency map for current window of a
            Map<Integer, Integer> freqWindow = new HashMap<>();
            int matches = 0;

            // Initialize first window
            for (int i = 0; i < m; i++) {
                int x = a[i];
                freqWindow.put(x, freqWindow.getOrDefault(x, 0) + 1);
                if (freqWindow.get(x) <= freqB.getOrDefault(x, 0)) {
                    matches++;
                }
            }

            int goodCount = 0;
            if (matches >= k)
                goodCount++;

            // Slide the window
            for (int i = m; i < n; i++) {
                // Remove a[i-m]
                int left = a[i - m];
                if (freqWindow.get(left) <= freqB.getOrDefault(left, 0)) {
                    matches--;
                }
                freqWindow.put(left, freqWindow.get(left) - 1);

                // Add a[i]
                int right = a[i];
                freqWindow.put(right, freqWindow.getOrDefault(right, 0) + 1);
                if (freqWindow.get(right) <= freqB.getOrDefault(right, 0)) {
                    matches++;
                }

                if (matches >= k)
                    goodCount++;
            }

            pw.println(goodCount);
        }

        pw.flush();
    }
}