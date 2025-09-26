import java.io.*;
import java.util.*;

public class BoringDay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int wins = 0;
            long sum = 0;
            int left = 0;

            for (int right = 0; right < n; right++) {
                sum += a[right];

                // If sum exceeds r, we need to end the round somewhere
                while (sum > r && left <= right) {
                    // Check if current segment [left, right] is valid
                    if (sum >= l && sum <= r) {
                        wins++;
                        sum = 0;
                        left = right + 1;
                        break;
                    }

                    // If removing from left helps
                    sum -= a[left];
                    left++;

                    // Check if current segment is valid after removal
                    if (sum >= l && sum <= r) {
                        wins++;
                        sum = 0;
                        left = right + 1;
                        break;
                    }
                }

                // Check if we have a valid segment
                if (sum >= l && sum <= r) {
                    wins++;
                    sum = 0;
                    left = right + 1;
                }
            }

            // Handle case where we have cards left that are all < l
            // We need to combine them into rounds (which will be losses)
            if (left < n) {
                // Count remaining rounds (each round must have at least one card)
                while (left < n) {
                    wins++; // These rounds will be losses since sum < l
                    left++;
                }
            }

            sb.append(wins).append("\n");
        }

        System.out.print(sb);
    }
}