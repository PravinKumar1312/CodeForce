import java.util.*;
import java.io.*;

public class AssemblyViaMinimums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int m = n * (n - 1) / 2;
            int[] b = new int[m];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);

            int[] a = new int[n];
            int idx = 0;
            int skip = n - 1;

            for (int i = 0; i < m && idx < n;) {
                a[idx] = b[i];
                idx++;
                i += skip;
                skip--;
            }

            // Set the last element
            a[n - 1] = b[m - 1];

            StringBuilder sb = new StringBuilder();
            for (int num : a) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}