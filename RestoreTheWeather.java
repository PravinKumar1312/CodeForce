import java.util.*;
import java.io.*;

public class RestoreTheWeather {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            // Create array of indices for a
            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) {
                indices[i] = i;
            }

            // Sort indices based on a values
            Arrays.sort(indices, (i, j) -> Integer.compare(a[i], a[j]));

            // Sort b array
            Arrays.sort(b);

            // Create result array
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[indices[i]] = b[i];
            }

            // Output the result
            for (int i = 0; i < n; i++) {
                pw.print(result[i]);
                if (i < n - 1) {
                    pw.print(" ");
                }
            }
            pw.println();
        }

        pw.flush();
    }
}