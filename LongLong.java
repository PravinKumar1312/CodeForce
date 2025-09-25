import java.io.*;
import java.util.*;

public class LongLong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            long maxSum = 0;
            int operations = 0;
            boolean inNegativeSegment = false;

            for (int i = 0; i < n; i++) {
                maxSum += Math.abs(arr[i]);

                if (arr[i] < 0 && !inNegativeSegment) {
                    // Start of a new negative segment
                    operations++;
                    inNegativeSegment = true;
                } else if (arr[i] > 0) {
                    // End of negative segment
                    inNegativeSegment = false;
                }
                // Zeros don't affect the segment counting
            }

            sb.append(maxSum).append(" ").append(operations).append("\n");
        }

        System.out.print(sb);
    }
}