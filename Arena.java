import java.util.*;
import java.io.*;

public class Arena {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // Find minimum value
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            // Count occurrences of minimum
            int countMin = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == min) {
                    countMin++;
                }
            }

            // If all elements are the same (all are minimum), no one can win
            if (countMin == n) {
                System.out.println(0);
            } else {
                // All heroes except those with minimum level can potentially win
                System.out.println(n - countMin);
            }
        }
    }
}