import java.io.*;
import java.util.*;

public class AlternatingSequence {
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

            long sum = 0;
            int i = 0;
            while (i < n) {
                long max = arr[i];
                int j = i;
                if (arr[i] > 0) {
                    while (j < n && arr[j] > 0) {
                        max = Math.max(max, arr[j]);
                        j++;
                    }
                } else {
                    while (j < n && arr[j] < 0) {
                        max = Math.max(max, arr[j]);
                        j++;
                    }
                }
                sum += max;
                i = j;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}